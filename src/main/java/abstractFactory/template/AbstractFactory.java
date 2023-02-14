package abstractFactory.template;

import java.util.Locale;

public class AbstractFactory {
    public static IProduct make(String objectType){
        IProduct product = null;
        switch (objectType.toLowerCase()){
            case"producta":
                product = new ConcreteProductA();
                break;
            case "productb":
                product = new ConcreteProductB();
                break;
            case "productc":
                product = new ConcreteProductC();
                break;
        }
        return product;
    }
}
