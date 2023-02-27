package mediator;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalComunicacion{
    private Map<String, Persona> profesionalChat = new HashMap<>();

    public Skype addProfesionalToTheChat(String ci, Persona profesional) {
        profesionalChat.put(ci, profesional);
        return this;
    }

    @Override
    public void send(String mensaje, Persona colleague) {
        for (String prof : profesionalChat.keySet()) {
            if (!colleague.getCi().equals(prof)) {
                if (colleague.getCargo().equals("QA") && profesionalChat.get(prof).getCargo().equals("QA")) {
                    profesionalChat.get(prof).received(mensaje);
                } else if (colleague.getCargo().equals("dev") && profesionalChat.get(prof).getCargo().equals("dev")) {
                    profesionalChat.get(prof).received(mensaje);
                } else if (colleague.getCargo().equals("SM")) {
                    profesionalChat.get(prof).received(mensaje);
                }
            }
        }
    }
}
