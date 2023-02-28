package memento;

public class Memento {
    private Backup state;

    public Memento(Backup stateSaved){
        this.state=stateSaved;
    }

    public Backup getState() {
        return state;
    }
}
