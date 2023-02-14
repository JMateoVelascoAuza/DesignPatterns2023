package Builder.practice;

public class Client {
    public static void main(String[] args) {
        Armado armado = new Armado();
        I5baja baja = new I5baja();
        I7media media = new I7media();
        I9alta alta = new I9alta();

        armado.setComputadora(baja);
        armado.buildComputadora();
        Computadora pcBaja = armado.getComputadora();
        pcBaja.showInfo();

        armado.setComputadora(media);
        armado.buildComputadora();
        Computadora pcMedia = armado.getComputadora();
        pcMedia.showInfo();

        armado.setComputadora(alta);
        armado.buildComputadora();
        Computadora pcAlta = armado.getComputadora();
        pcAlta.showInfo();

    }
}
