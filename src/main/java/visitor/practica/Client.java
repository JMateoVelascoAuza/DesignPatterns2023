package visitor.practica;

public class Client {
    public static void main(String[] args) {
        Turista turista = new Turista();
        Bolivia bolivia = new Bolivia();
        bolivia.libreCambio(turista, 7000);

        EEUU eeuu = new EEUU();
        eeuu.libreCambio(turista, 2000);

        Europa europa = new Europa();
        europa.libreCambio(turista, 500);
    }
}
