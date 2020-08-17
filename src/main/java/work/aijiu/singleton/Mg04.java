package work.aijiu.singleton;

/**
 * 懒汉式
 * 线程不安全可以加锁，但效率会下降
 */
public class Mg04 {
    private static Mg04 INSTANCE;

    private Mg04(){

    }

    public static synchronized Mg04 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mg04();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->System.out.println(Mg04.getInstance().hashCode())).start();
        }
    }
}
