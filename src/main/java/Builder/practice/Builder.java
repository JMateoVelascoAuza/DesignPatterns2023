package Builder.practice;

public abstract class Builder {
    protected  Computadora computadora;

    public Computadora getComputadora() {
        return computadora;
    }

    public void construir(){
        computadora = new Computadora();
    }
    public abstract void buildMonitor();
    public abstract void buildTeclado();
    public abstract void buildMouse();
    public abstract void buildMemoria();
    public abstract void buildProcesador();
    public abstract void buildVideo();
    public abstract void buildNombre();
}
