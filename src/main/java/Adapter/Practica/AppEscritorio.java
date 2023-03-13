package Adapter.Practica;

public class AppEscritorio implements IEmpresa2 {
    private String name;
    private String type;
        public AppEscritorio(String name) {
            this.name = name;
            type = "Escritorio";
        }

        @Override
        public void iniciarSesion() {
            System.out.println("<===Iniciando Sesion===>");
            System.out.println("Nombre de la app: " + name);
            System.out.println("Tipo de app: " + type);
            System.out.println("<===============>");
            System.out.println();
        }

        @Override
        public void cerrarSesion() {
            System.out.println("<===Cerrando Sesion===>");
            System.out.println("Nombre de la app: " + name);
            System.out.println("Tipo de app: " + type);
            System.out.println("<===============>");
            System.out.println();
        }

        @Override
        public void generarDatos() {
            System.out.println("<===Generando Datos===>");
            System.out.println("Nombre de la app: " + name);
            System.out.println("Tipo de app: " + type);
            System.out.println("<===============>");
            System.out.println();
        }
}
