package ChainOfResponsability;

public class Client {
    public static void main(String[] args) {
        ClientSupport clientSupport = new ClientSupport();

        clientSupport.reportarProblema(new Fallas("Bug Collision", "BAJA", "Dos estructuras estan colisionando"));
        clientSupport.reportarProblema(new Fallas("WallHack", "MEDIA", "Persona viendo a traves de las paredes"));
        clientSupport.reportarProblema(new Fallas("Aimbot", "ALTA", "Persona con Apuntado Automatico"));
        clientSupport.reportarProblema(new Fallas("All Unlock", "CRITICA", "Gente con todo desbloqueado"));
    }
}
