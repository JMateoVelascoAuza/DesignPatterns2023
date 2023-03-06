package State;

import java.util.List;

public class Restart implements IState {


    @Override
    public void cambiarComponentes(PC pc) {
        System.out.println("Reiniciando computadora");
        List<String> openPrograms = pc.getProgramasAbiertos();
        for (String programa : openPrograms) {
            System.out.println("Cerrando el programa: "+programa);
        }
        pc.getProgramasAbiertos().clear();
        pc.getCpu().setConsumo(0);
        pc.getRam().setConsumo(0);
        System.out.println("Computadora reiniciada");
    }
}
