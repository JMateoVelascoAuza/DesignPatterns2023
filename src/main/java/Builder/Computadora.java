package Builder;

public class Computadora {
    private String nombre;
    private int monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private int video;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }
    public void showInfo(){
        System.out.println("******* "+nombre+" *******");
        System.out.println("Memoria: "+memoria);
        System.out.println("Procesador:"+procesador);
        System.out.println("Video:"+video);
        System.out.println("Monitor: "+monitor);
        System.out.println("Teclado: "+teclado);
        System.out.println("Mouse: "+mouse);

    }
}


