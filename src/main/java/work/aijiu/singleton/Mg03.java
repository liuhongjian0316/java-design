package work.aijiu.singleton;

/**
 * 懒汉式
 * 什么时候用 什么时候初始化
 * 虽然达到按需初始化的目的，但却带来了线程不安全的问题
 */
public class Mg03 {
    private static Mg03 INSTANCE;

    private Mg03(){

    }

    public static Mg03 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mg03();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mg03.getInstance().hashCode())).start();
        }
    }
}
