package command;

public class Personaje {
    private String nombre;



    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public void jump(){
        System.out.println(nombre+" esta saltando ");
    }

    public void run(){
        System.out.println(nombre+" esta corriendo");
    }

    public void hit(){
        System.out.println(nombre+" procede a golpear al enemigo");
    }

    public void cover(){
        System.out.println(nombre+" esta a cubierto");
    }

    public void heal(){
        System.out.println(nombre+" se esta curando [+]");
    }
}
