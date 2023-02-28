package memento;
import java.util.ArrayList;
import java.util.List;
public class BDD {
    private List<Memento> stateSaved = new ArrayList<>();

    public void addMemento(Memento memento){
        stateSaved.add(memento);
    }

    public Memento getMemento(int position) {
        return stateSaved.get(position);
    }
}
