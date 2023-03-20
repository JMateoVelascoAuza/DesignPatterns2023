package Decorator.Practica;

public class Taxi implements IVehiculo{
    @Override
    public void avanzar() {
        System.out.println("El taxi arranca");
    }
}
