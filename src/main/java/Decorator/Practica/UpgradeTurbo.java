package Decorator.Practica;

public class UpgradeTurbo extends Decorator{

    public UpgradeTurbo(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void avanzar() {
        System.out.println("El vehiculo puede utlizar ahora N20");
    }
}
