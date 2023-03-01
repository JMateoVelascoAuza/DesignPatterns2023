package ChainOfResponsability;

public class Fallas {

    private String titulo;
    private String severidad;
    private String descripcion;

    public Fallas(String titulo, String severidad, String descripcion) {
        this.titulo = titulo;
        this.severidad = severidad;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String nombre) {
        this.titulo = nombre;
    }
    public String getSeveridad() {
        return severidad;
    }
    public void setSeveridad(String ci) {
        this.severidad = ci;
    }

    public void show(){
        System.out.println("++++++++ FALLA REPORTADA +++++++++");
        System.out.println("Titulo: "+titulo);
        System.out.println("Severidad: "+severidad);
        System.out.println("Descripcion: "+descripcion);
    }



    public String getDescripcion() {
        return descripcion;
    }



    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
