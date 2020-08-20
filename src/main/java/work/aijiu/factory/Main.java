package work.aijiu.factory;

public class Main {
    public static void main(String[] args) {
       Moveable m = new Plane();
       m.go();

       Moveable c = new CartFactory().create();
       c.go();

    }
}
