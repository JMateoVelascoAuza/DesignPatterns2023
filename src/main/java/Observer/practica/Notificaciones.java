package Observer.practica;

public class Notificaciones {
    private String tipo;
    private String descripcion;

    public Notificaciones(String tipo, String descripcion){
        this.tipo=tipo;
        this.descripcion=descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void showInfo() {
        System.out.println("NOTIFICACION DE TIPO:" + tipo);
        System.out.println("Descripcion: "+ descripcion);
    }
}
