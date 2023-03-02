package command;

public class CJump implements ICommand {
    private Personaje personaje;

    public CJump(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void execute() {
        this.personaje.jump();
    }
}
