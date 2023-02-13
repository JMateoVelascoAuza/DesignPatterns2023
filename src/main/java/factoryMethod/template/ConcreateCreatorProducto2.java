package factoryMethod.template;

public class ConcreateCreatorProducto2  extends Creator{

    @Override
    public ConcreteProduct2 factoryMethod() {
        ConcreteProduct2 p2 = new ConcreteProduct2();
        //Toda la logica de creacion del concrete product1

        return p2;
    }
}
