package command;

public class CRun implements ICommand {
    private Personaje personaje;

    public CRun(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.run();
    }
}
