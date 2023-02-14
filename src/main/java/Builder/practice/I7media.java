package Builder.practice;

public class I7media extends Builder{
    @Override
    public void buildNombre() {
        this.computadora.setNombre("I7-Media");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("16Gb");
    }

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor(32);
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("RGB");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("i7");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("RGB");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo(8);
    }
}
