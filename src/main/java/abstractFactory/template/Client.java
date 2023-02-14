package abstractFactory.template;

public class Client {
    public static void main(String[] args) {
        String dato = "";
        if(dato.equals("ConcreteProductA")){
            ConcreteProductA concreteProductA = new ConcreteProductA();
            concreteProductA.methodA();
            concreteProductA.methodB();
            concreteProductA.methodC();
        } else if (dato.equals("ConcreteProductB")) {
            ConcreteProductB concreteProductB = new ConcreteProductB();
            concreteProductB.methodA();
            concreteProductB.methodB();
            concreteProductB.methodC();
        }else if (dato.equals("ConcreteProductC")) {
            ConcreteProductC concreteProductC = new ConcreteProductC();
            concreteProductC.methodA();
            concreteProductC.methodB();
            concreteProductC.methodC();
        }


    }
}
