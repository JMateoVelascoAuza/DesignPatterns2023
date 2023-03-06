package Observer.template;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserverA());
        subject.attach(new ConcreteObserverA());
        subject.setA2("Deberia Notificar");
    }
}
