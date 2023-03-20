package Decorator.Practica;

public class UpgradeGPS extends Decorator{

    public UpgradeGPS(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void avanzar() {
        System.out.println("El vehiculo ahora puede utilizar el GPS");
    }
}
