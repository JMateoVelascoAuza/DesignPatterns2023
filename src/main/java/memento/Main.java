package memento;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BDD bd = new BDD();
        Originator o = new Originator();
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Joel", "54431237", 22));
        listaPersonas.add(new Persona("Juan", "64321237", 29));
        listaPersonas.add(new Persona("Rodrogas", "15832338", 19));
        listaPersonas.add(new Persona("Anuel", "52034987", 25));
        listaPersonas.add(new Persona("Ana", "32679802", 49));

        Backup backup;

        backup= new Backup("BackupEnero",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Ian", "47238122", 21));

        backup= new Backup("BackupFebrero",listaPersonas);
        o.setState(backup);
        bd.addMemento(o.createMemento());
        listaPersonas.add(new Persona("Lucianito", "403882881", 15));
        listaPersonas.add(new Persona("Manuela", "95483828", 8));

        backup= new Backup("BackupMarzo",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Samuel", "68953433", 80));

        backup= new Backup("BackupAbril",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Antonio", "943827711", 50));

        backup= new Backup("BackupMayo",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Javier", "10298344", 32));

        o.restoreFromMemento(bd.getMemento(0));
    }
}
