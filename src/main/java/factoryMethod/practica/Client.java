package factoryMethod.practica;

public class Client {
    public static void main(String[] args) {
        PasajeEstandar estandar1 = (PasajeEstandar) new PasajeEstandarCreator().createPasage(new Pasajero("Vladimir Makarov", "5463728"), "COD9");
        PasajeEstandar estandar2 = (PasajeEstandar) new PasajeEstandarCreator().createPasage(new Pasajero("Imran Zakhaev", "2837465"), "COD4");

        PasajeSolidario solidario1 = (PasajeSolidario) new PasajeSolidarioCreator().createPasage(new Pasajero("John Price", "60613"), "B60");
        PasajeSolidario solidario2 = (PasajeSolidario) new PasajeSolidarioCreator().createPasage(new Pasajero("Simon Riley", "85470"), "B01");

        PasajeInfantil infantil1 = (PasajeInfantil) new PasajeInfantilCreator().createPasage(new Pasajero("Rick Grimes", "3011116"), "R6");
        PasajeInfantil infantil2 = (PasajeInfantil) new PasajeInfantilCreator().createPasage(new Pasajero("Daryl Dixon", "1010912"), "B1");

        estandar1.showInfo();
        estandar2.showInfo();

        solidario1.showInfo();
        solidario2.showInfo();

        infantil1.showInfo();
        infantil2.showInfo();
    }
}
