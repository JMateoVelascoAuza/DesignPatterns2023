package mediator;

public class Sm extends Persona{
    private String certificaciones;
    public Sm(ICanalComunicacion canalComunicacion, String certificaciones) {
        super(canalComunicacion);
        this.certificaciones=certificaciones;
    }

    @Override
    public void send(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfoPersona();
        System.out.println("Certificaciones: "+certificaciones);
        System.out.println("Mensaje recibido correctamente... "+msg+"\n");
    }
}
