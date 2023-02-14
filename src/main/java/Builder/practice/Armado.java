package Builder.practice;

public class Armado {
    private  Builder builder;

    public Computadora getComputadora(){
        return builder.getComputadora();
    }

    public void setComputadora(Builder builder){
        this.builder = builder;
    }

    public void buildComputadora(){
        this.builder.construir();
        this.builder.buildMemoria();
        this.builder.buildMonitor();
        this.builder.buildMouse();
        this.builder.buildProcesador();
        this.builder.buildTeclado();
        this.builder.buildVideo();
        this.builder.buildNombre();
    }
}
