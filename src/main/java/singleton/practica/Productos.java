package singleton.practica;

public class Productos {
    private String nombre;
    private String tipo;

    public Productos(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void inventariar(){
        Logger.getInstance().write("Inventariando el producto: "+nombre+" de tipo "+tipo);
    }
    public String nombre(){
        return nombre+"de tipo: "+tipo;
    }
}
