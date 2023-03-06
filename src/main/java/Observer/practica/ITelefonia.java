package Observer.practica;

public interface ITelefonia {
    void darServicio(IUser user, String tipo);
    void removeServicio(IUser user);
    void notify(Notificaciones notificaciones);
}
