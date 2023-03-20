package Composite.Practica;

public interface Component {
    String getName();
    int getPrice();
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
}
