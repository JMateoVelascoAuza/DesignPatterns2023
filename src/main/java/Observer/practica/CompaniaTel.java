package Observer.practica;

import java.util.ArrayList;
import java.util.List;

public class CompaniaTel implements ITelefonia {
    private String nombre;
    private List<IUser> userList = new ArrayList<>();
    private List<Notificaciones> notifList = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<IUser> getUserList() {
        return userList;
    }

    public void setUserList(List<IUser> userList) {
        this.userList = userList;
    }

    @Override
    public void darServicio(IUser user, String tipo) {
        user.setTipoNotif(tipo);
        userList.add(user);
    }

    @Override
    public void removeServicio(IUser user) {
        userList.remove(user);
    }

    @Override
    public void notify(Notificaciones notificaciones) {
        for(IUser usuario : userList){
            if(notificaciones.getTipo().equals(usuario.getTipoNotif())){
                usuario.update(nombre+" tiene lo que buscas:",notificaciones);
            }
        }
    }
}
