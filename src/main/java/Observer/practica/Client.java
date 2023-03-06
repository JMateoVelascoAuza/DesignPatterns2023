package Observer.practica;

public class Client {
    public static void main(String[] args) {
        CompaniaTel tigo = new CompaniaTel();
        tigo.setNombre("TIGO");

        Usuario bruce = new Usuario("Bruce Wayne");
        Usuario hardy = new Usuario("Michael Hardy");
        Usuario blake = new Usuario("Blake Shelton");

        tigo.darServicio(bruce,"Premios");
        tigo.darServicio(bruce,"Promociones");
        tigo.darServicio(hardy, "Noticia");
        tigo.darServicio(blake, "Precio Llamadas");
        tigo.darServicio(blake, "Promociones");
        tigo.darServicio(blake, "Premios");
        tigo.darServicio(blake, "Noticia");

        //++++++++++++++++++++++++++

        tigo.notify(new Notificaciones("Premios","Ganaste una entrada al concierto de Ghost"));
    }
}
