package Decorator.Practica;

public class UpgradeGas extends Decorator{

    public UpgradeGas(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void avanzar() {
        System.out.println("El vehiculo ahora tiene la instalacion de GNV");
    }
}
