package prototype.example;

public class Client {
    public static void main(String[] args) {
        EntradaStadium prototypeE = new EntradaStadium(
                new Equipo("Bolivia", "24"),
                new Equipo("Espana", "24"),
                new Stadium("Hernando Siles", "24000")
        );
        prototypeE.setFecha("07/07/2023");
        prototypeE.setLugar("La Paz");
        prototypeE.setPrecioEntrada("120");
        prototypeE.setNumeroAsiento(1);
        prototypeE.setPersona(new Persona("",""));
        prototypeE.showInfo();
    }
}
