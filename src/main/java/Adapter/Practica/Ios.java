package Adapter.Practica;

public class Ios implements IEmpresa1 {
    private String name;
    private String type;

    public Ios(String name) {
        this.name = name;
        type = "Ios";
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
