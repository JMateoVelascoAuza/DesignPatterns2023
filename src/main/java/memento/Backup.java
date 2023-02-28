package memento;
import java.util.List;

public class Backup {
    private String nombre;
    private List<Persona> personas;

    public Backup(String nombre, List<Persona> personas){
        this.nombre= nombre;
        this.personas=personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public void showInfo(){
        System.out.println("Backup: "+ nombre);
        System.out.println("Personas:" );
        for(Persona p:personas){
            p.showInfo();
        }
    }
}
