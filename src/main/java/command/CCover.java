package command;

public class CCover implements ICommand {
    private Personaje personaje;

    public CCover(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.cover();
    }
}
