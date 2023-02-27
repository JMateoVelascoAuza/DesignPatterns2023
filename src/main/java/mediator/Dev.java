package mediator;

public class Dev extends Persona{
    private String lenguaje;
    public Dev(ICanalComunicacion canalComunicacion, String lenguaje) {
        super(canalComunicacion);
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfoPersona();
        System.out.println("Lenguaje: "+ lenguaje);
        System.out.println("Mensaje recibido correctamente... "+msg+"\n");
    }
}
