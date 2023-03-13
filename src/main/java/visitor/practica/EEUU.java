package visitor.practica;

public class EEUU implements IPais {
    @Override
    public void libreCambio(IViajero viajero, double dinero) {
        viajero.convertirDinero(dinero, this);
    }
}
