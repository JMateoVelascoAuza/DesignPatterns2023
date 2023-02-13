package factoryMethod.practica;

public class PasajeInfantilCreator extends PasajeCreator {

    @Override
    public IPasaje createPasage(Pasajero pasajero, String numeroDeAsiento) {
        PasajeInfantil pasaje = new PasajeInfantil();
        pasaje.setAvion(new Avion("ANTONOV", 500000, "AN-225", 1000));
        pasaje.setPrecio("Bs 5000");
        pasaje.setOrigen(new Lugar("Bolivia", "La Paz", "Aeropueto Internacional de Bolivia"));
        pasaje.setDestino(new Lugar("Rusia", "Moscu", "Aeropuerto Internacional Zakhaev"));
        pasaje.setnVuelo("141TF");
        pasaje.setnAsiento(numeroDeAsiento);
        pasaje.setPasajero(pasajero);
        return pasaje;
    }
}
