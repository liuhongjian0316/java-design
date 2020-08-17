package work.aijiu.singleton;


/**
 * 与01相同 区别是用静态代码块初始化
 */
public class Mg02 {
    private static final Mg02 INSTANCE;
    static {
        INSTANCE = new Mg02();
    }

    private Mg02(){};

    public static Mg02 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mg02 m1 = Mg02.getInstance();
        Mg02 m2 = Mg02.getInstance();
        System.out.println(m1==m2); //true 只实例出一个实例
    }


}
