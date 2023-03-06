package State;

public class RAM {
    private String nombreRAM;
    private double consumo = 0;

    public RAM(String nombreRAM) {
        this.nombreRAM = nombreRAM;
    }

    public void showInfo() {
        System.out.println("---->RAM");
        System.out.println("Nombre: " + nombreRAM);
        System.out.println("Consumo: "+consumo);
    }

    public String getNombreRAM() {
        return nombreRAM;
    }

    public void setNombreRAM(String nombreRAM) {
        this.nombreRAM = nombreRAM;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
