package State;

public class Off implements IState{
    @Override
    public void cambiarComponentes(PC pc) {
        System.out.println("Apagando PC");
        pc.getProgramasAbiertos().clear();
        pc.getCpu().setConsumo(1);
        pc.getRam().setConsumo(1);
        System.out.println("PC Apagada!");
    }
}
