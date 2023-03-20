package Composite.Practica;

import java.util.ArrayList;
import java.util.List;

public class PCHolder implements Component{

    private int totalPrice;
    private String name;
    private List<Component> pcs = new ArrayList<>();

    public PCHolder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        setTotalPrice();
        return totalPrice;
    }

    private void setTotalPrice(){
        for (Component c: pcs){
            totalPrice += c.getPrice();
        }
    }

    @Override
    public void add(Component component) {
        pcs.add(component);
    }

    @Override
    public void remove(Component component) {
        pcs.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return pcs.get(i);
    }
}
