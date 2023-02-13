package factoryMethod.practica;

public class Avion {
    private String marca;
    private int capacidad;
    private String modelo;
    private int numeroAsientos;

    public Avion(String marca, int capacidad, String modelo, int numeroAsientos) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.numeroAsientos = numeroAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void showInfo(){
        System.out.println("INFORMACION GENERAL DEL AVION:");
        System.out.println("Marca-"+marca+"   Modelo-"+modelo+"   Capacidad-"+capacidad+"   Numero De Asientos-"+numeroAsientos);
    }
}
