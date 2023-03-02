package command;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private List<ICommand> comandos = new ArrayList<>();
    private String accion;

    public Nivel(String accion) {
        this.accion = accion;
    }

    public Nivel addCommand(ICommand comando){
        comandos.add(comando);
        return this;
    }

    public void run(int level){
        System.out.println(" ");
        System.out.println("NIVEL "+level);
        System.out.println("ACCION DESBLOQUEADA: "+accion);
        for (ICommand cmd:comandos) {
            cmd.execute();
        }
        comandos.clear();
    }
}
