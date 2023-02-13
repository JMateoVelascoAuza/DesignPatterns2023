package factoryMethod.template;

public class Client {
    public static void main(String[] args) {
        ConcreteProduct1 p1 = new ConcreteProduct1();
        p1.create();



        IProduct prod1 = new ConcreateCreatorProducto1().factoryMethod();
    }
}
