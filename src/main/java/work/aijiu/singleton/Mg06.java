package work.aijiu.singleton;

/**
 * 懒汉式
 * 线程不安全可以加锁，但效率会下降
 * 双重检查
 */
public class Mg06 {
    private static Mg06 INSTANCE;

    private Mg06(){

    }

    public static Mg06 getInstance(){
        if(INSTANCE == null){
            //双重检查
            synchronized(Mg06.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mg06();
                }
            }
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->System.out.println(Mg06.getInstance().hashCode())).start();
        }
    }
}
