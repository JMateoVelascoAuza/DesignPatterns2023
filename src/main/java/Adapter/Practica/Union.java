package Adapter.Practica;

public class Union  implements IEmpresa1 {
    private IEmpresa2 union;

    public Union(IEmpresa2 union) {
        this.union = union;
    }

    @Override
    public void login() {
        union.iniciarSesion();
    }

    @Override
    public void logout() {
        union.cerrarSesion();
    }

    @Override
    public void reportes() {
        union.generarDatos();
    }
}
