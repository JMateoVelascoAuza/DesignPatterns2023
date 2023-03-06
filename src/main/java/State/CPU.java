package State;

public class CPU {
    private String nombreCPU;
    private double consumo;

    public CPU(String nombreCPU) {
        this.nombreCPU = nombreCPU;
    }
    public void showInfo() {
        System.out.println("----> CPU");
        System.out.println("Nombre: "+nombreCPU);
        System.out.println("Consumo: "+ consumo);
    }

    public String getNombreCPU() {
        return nombreCPU;
    }

    public void setNombreCPU(String nombreCPU) {
        this.nombreCPU = nombreCPU;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
