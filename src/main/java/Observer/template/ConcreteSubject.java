package Observer.template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
    private String a1;
    private String a2;
    private List<IObserver> observerList;

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
        this.notifyObservers();
    }

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: observerList){
            observer.update("El atribuuto 2 fue modificado a este valor"+a2);
        }
    }
}
