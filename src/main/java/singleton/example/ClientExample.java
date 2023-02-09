package singleton.example;

public class ClientExample {
    public static void main(String[] args) {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {

                Sucursal sucursalA = new Sucursal(new Cliente("Jose"));
                sucursalA.retirarDinero(100);
            }
        }        );
        Thread c1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajero = new Cajero(new Cliente("Jose"));
                cajero.retirarDinero(500);
            }
        });

    }
}
