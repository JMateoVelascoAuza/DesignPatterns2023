package visitor.practica;

public class Bolivia implements IPais {
    @Override
    public void libreCambio(IViajero viajero, double dinero) {
        viajero.convertirDinero(dinero, this);
    }
}
