package prototype.example;

public class EntradaStadium implements IEntrada{
    private Equipo local;
    private Equipo visitante;
    private int numeroAsiento;
    private String fecha;
    private String lugar;
    private Stadium stadium;
    private String precioEntrada;
    private Persona persona;

    public EntradaStadium(Equipo local, Equipo visitante, Stadium stadium) {
        this.local = local;
        this.visitante = visitante;
        this.stadium = stadium;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public String getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(String precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone() {
        EntradaStadium clone = new EntradaStadium(this.local, this.visitante,this.stadium);
        return null;
    }

    public void showInfo(){
        System.out.println("INFO>STADIUM: name"+ local + visitante);
        System.out.println("INFO>STADIUM: numero de jugaro "+ fecha);
    }
}
