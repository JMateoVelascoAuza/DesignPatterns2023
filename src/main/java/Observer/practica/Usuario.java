package Observer.practica;

public class Usuario implements IUser{
    private String nombre;
    private String tipoNotif;

    public Usuario(String nombre){
        this.nombre=nombre;
    }

    @Override
    public void update(String message, Notificaciones notificaciones) {
        System.out.println("NOTIFICACION");
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo de Notificacion: "+tipoNotif);
        System.out.println(message);
        notificaciones.showInfo();
        System.out.println(" ");
        System.out.println(" ");
    }

    @Override
    public void setTipoNotif(String tipo) {
        this.tipoNotif=tipo;
    }

    @Override
    public String getTipoNotif() {
        return tipoNotif;
    }
}
