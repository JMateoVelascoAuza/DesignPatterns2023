package factoryMethod.practica;

public class PasajeEstandarCreator extends PasajeCreator{



    @Override
    public IPasaje createPasage(Pasajero pasajero, String numeroDeAsiento) {
        PasajeEstandar pasaje = new PasajeEstandar();
        pasaje.setAvion(new Avion("BOEING", 20000, "847", 300));
        pasaje.setPrecio("Bs. 2450");
        pasaje.setOrigen(new Lugar("Bolivia", "La Paz", "Aeropueto Internacional de Boliva"));
        pasaje.setDestino(new Lugar("Espana", "Madrid", "Aeropuerto Internacional de Madrid"));
        pasaje.setnVuelo("627JP");
        pasaje.setnAsiento(numeroDeAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }
}
