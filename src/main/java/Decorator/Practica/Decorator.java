package Decorator.Practica;

public class Decorator implements IVehiculo{

    private IVehiculo vehiculo;

    public Decorator(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    @Override
    public void avanzar() {
        System.out.println("Añadiendo mejoras......");

    }
}
