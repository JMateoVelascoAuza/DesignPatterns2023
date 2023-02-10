package prototype.practica;

public class SamsungR10 implements IPhone{
    private String tamano;
    private String cpu;
    private String memoriaRAM;
    private double versionAndroid;
    private String camara;
    private double bluetooth;
    private int cantMemoriasExt;
    private String tipoBateria;
    private SIM sim;
    private Accesorios accesorios;

    public SamsungR10(String cpu, double versionAndroid, String camara, double bluetooth, int cantMemoriasExt, String tipoBateria) {
        this.cpu = cpu;
        this.versionAndroid = versionAndroid;
        this.camara = camara;
        this.bluetooth = bluetooth;
        this.cantMemoriasExt = cantMemoriasExt;
        this.tipoBateria = tipoBateria;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(double versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public double getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(double bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantMemoriasExt() {
        return cantMemoriasExt;
    }

    public void setCantMemoriasExt(int cantMemoriasExt) {
        this.cantMemoriasExt = cantMemoriasExt;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    public void showInfo(){
        System.out.println("**********************************");
        System.out.println("INFO GENERAL: CPU-"+getCpu()+" Android-"+getVersionAndroid()+" Camara-"+getCamara());
        System.out.println("Bluetooth-"+bluetooth+" Cantidad de Memorias Externas-"+cantMemoriasExt+" Bateria-"+tipoBateria);
        System.out.println("INFO PERSONALIZADA: Almacenamiento-"+tamano+" Memoria RAM-"+memoriaRAM);
        sim.showInfo();
        accesorios.showInfo();
    }

    @Override
    public SamsungR10 clone() {
        SamsungR10 clone = new SamsungR10(this.cpu,this.versionAndroid,this.camara,this.bluetooth,this.cantMemoriasExt,this.tipoBateria);
        clone.setSim(this.getSim());
        clone.setAccesorios(this.getAccesorios());
        clone.setTamano(this.getTamano());
        clone.setMemoriaRAM(this.getMemoriaRAM());
        return clone;
    }
}
