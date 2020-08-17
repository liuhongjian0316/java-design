package work.aijiu.singleton;


/**
 * 饿汉式
 * 类加载到内存中，就实例化一个实例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点，不管用到与否，类装载时就完成实例化
 * 话说你要不用，你装载干嘛
 */
public class Mg01 {
    private static final Mg01 INSTANCE = new Mg01();

    private Mg01(){};

    public static Mg01 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mg01 m1 = Mg01.getInstance();
        Mg01 m2 = Mg01.getInstance();
        System.out.println(m1==m2); //true 只实例出一个实例
    }


}
