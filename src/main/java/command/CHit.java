package command;

public class CHit implements ICommand {
    private Personaje personaje;

    public CHit(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.hit();
    }
}
