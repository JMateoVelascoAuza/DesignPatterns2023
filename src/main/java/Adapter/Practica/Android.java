package Adapter.Practica;

public class Android implements IEmpresa1 {
    private String name;
    private String type;

    public Android(String name) {
        this.name = name;
        type = "Android";
    }

    @Override
    public void login() {
        System.out.println("<===Login===>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("SO: " + type);
        System.out.println("<=======>");
        System.out.println();
    }

    @Override
    public void logout() {
        System.out.println("<===Logout===>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("SO: " + type);
        System.out.println("<=======>");
        System.out.println();
    }

    @Override
    public void reportes() {
        System.out.println("<===Reportes===>");
        System.out.println("Nombre de la app: " + name);
        System.out.println("SO: " + type);
        System.out.println("<=======>");
        System.out.println();
    }
}
