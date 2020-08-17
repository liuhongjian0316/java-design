package work.aijiu.singleton;

/**
 * 静态内部类方式
 * jvm加载保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mg07 {

    private Mg07(){

    }

    private static class Mg07Holder{
        private final static Mg07 INSTANCE = new Mg07();
    }

    public static Mg07 getInstance(){
        return Mg07Holder.INSTANCE;
    }

    private void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Thread(()->System.out.println(Mg07.getInstance().hashCode())).start();
        }
    }
}
