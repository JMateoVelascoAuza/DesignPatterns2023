package Builder.practice;

public class I5baja extends Builder{
    @Override
    public void buildNombre() {
        this.computadora.setNombre("I5-Baja");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("8Gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor(24);
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("Normal");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i5");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("Normal");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo(4);
    }
}
