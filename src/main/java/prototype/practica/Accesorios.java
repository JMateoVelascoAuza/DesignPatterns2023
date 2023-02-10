package prototype.practica;

public class Accesorios {
    private String audifonos;
    private String cargador;
    private String estuche;

    public Accesorios(String audifonos, String cargador, String estuche) {
        this.audifonos = audifonos;
        this.cargador = cargador;
        this.estuche = estuche;
    }

    public String getAudifonos() {
        return audifonos;
    }

    public void setAudifonos(String audifonos) {
        this.audifonos = audifonos;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public String getEstuche() {
        return estuche;
    }

    public void setEstuche(String estuche) {
        this.estuche = estuche;
    }
    public void showInfo(){
        System.out.println("Audifonos-"+audifonos+" Cargador-"+cargador+" Estuche-"+estuche);
    }

}
