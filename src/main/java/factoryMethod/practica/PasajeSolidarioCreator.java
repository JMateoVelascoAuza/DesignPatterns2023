package factoryMethod.practica;

public class PasajeSolidarioCreator extends PasajeCreator{

    private PasajeSolidario pasaje = new PasajeSolidario();

    @Override
    public IPasaje createPasage(Pasajero pasajero, String numeroAsiento) {
        pasaje.setAvion(new Avion("Lockheed", 3000, "SR-71", 10));
        pasaje.setPrecio("$us 250");
        pasaje.setOrigen(new Lugar("Estados Unidos", "Ohio", "Aeropueto Internacional de Ohio"));
        pasaje.setDestino(new Lugar("Ucrania", "Pripyat", "Aeropuerto Internacional de Chernobyl"));
        pasaje.setnVuelo("2905MM");
        pasaje.setnAsiento(numeroAsiento);
        pasaje.setPasajero(pasajero);
        pasajeSolidario(0.35, "Veterano");
        return pasaje;
    }

    public void pasajeSolidario(double descuento, String motivo) {
        pasaje.setDescuento(descuento);
        pasaje.setMotivoDelDescuento(motivo);
    }


}
