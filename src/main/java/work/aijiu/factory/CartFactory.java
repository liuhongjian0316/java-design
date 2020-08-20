package work.aijiu.factory;

/**
 *
 */
public class CartFactory {

    public Moveable create(){

        System.out.println("a car created");
        return new Car();
    }
}
