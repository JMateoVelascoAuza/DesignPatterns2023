package Observer.practica;

public interface IUser {
    void update(String message, Notificaciones notificaciones);
    void setTipoNotif(String tipo);
    String getTipoNotif();
}
