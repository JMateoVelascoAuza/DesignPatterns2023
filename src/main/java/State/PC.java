package State;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<String> programasAbiertos = new ArrayList<>();
    private CPU cpu;
    private IState state;
    private RAM ram;

    public PC(String nombreCPU, String nombreRAM) {
        state = new Off();
        cpu = new CPU(nombreCPU);
        ram = new RAM(nombreRAM);
    }
    public void changeState(IState state) {
        this.state = state;
        state.cambiarComponentes(this);
    }
    public void showInfo() {
        System.out.println("_______PC_______");
        System.out.println("Cantidad de programas abiertos: "+ programasAbiertos.size());
        System.out.println();
        ram.showInfo();
        cpu.showInfo();
    }

    public List<String> getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(List<String> programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
