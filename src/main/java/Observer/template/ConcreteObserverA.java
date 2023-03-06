package Observer.template;

public class ConcreteObserverA implements IObserver{
    @Override
    public void update(String msg){
        System.out.println(">>>>CovreteObsererB");
    }
}
