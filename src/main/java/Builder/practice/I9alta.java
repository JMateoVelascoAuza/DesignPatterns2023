package Builder.practice;

public class I9alta extends Builder{
    @Override
    public void buildNombre() {
        this.computadora.setNombre("I9-Alta");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("32Gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor(45);
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("Gamer");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i9");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("RGB");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo(16);
    }
}
