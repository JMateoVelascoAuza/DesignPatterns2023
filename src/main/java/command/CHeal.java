package command;

public class CHeal implements ICommand {
    private Personaje personaje;

    public CHeal(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.heal();
    }
}
