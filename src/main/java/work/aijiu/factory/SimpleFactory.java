package work.aijiu.factory;


/**
 * 简单工厂
 * 可扩展性不好
 * 
 */
public class SimpleFactory {

    public Car creeateCat(){
        return new Car();
    }

    public Plane createplane(){
        return new Plane();
    }
}
