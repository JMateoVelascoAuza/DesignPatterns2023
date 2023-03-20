package Decorator.Practica;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        IVehiculo mini = new Minibus();
        mini.avanzar();
        mini = new UpgradeTurbo(mini);
        mini.avanzar();
        mini = new UpgradeGas(mini);
        mini.avanzar();
        mini = new UpgradeGPS(mini);
        mini.avanzar();

        System.out.println();

        IVehiculo taxi = new Taxi();
        taxi.avanzar();
        taxi = new UpgradeGPS(taxi);
        taxi.avanzar();

        System.out.println();

        IVehiculo vago = new Vagoneta();
        vago.avanzar();
        vago = new UpgradeTurbo(vago);
        vago.avanzar();
        vago = new UpgradeGPS(vago);
        vago.avanzar();
    }
}
