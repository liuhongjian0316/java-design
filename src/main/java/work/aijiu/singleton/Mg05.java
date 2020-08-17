package work.aijiu.singleton;

/**
 * 懒汉式
 * 线程不安全可以加锁，但效率会下降
 */
public class Mg05 {
    private static Mg05 INSTANCE;

    private Mg05(){

    }

    public static  Mg05 getInstance(){
        if(INSTANCE == null){
            //妄图通过锁代码块的方式来提高效率，然后不可行
            synchronized(Mg05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mg05();
            }
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->System.out.println(Mg05.getInstance().hashCode())).start();
        }
    }
}
