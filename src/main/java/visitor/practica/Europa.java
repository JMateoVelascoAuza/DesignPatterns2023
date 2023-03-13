package visitor.practica;

public class Europa implements IPais {

    @Override
    public void libreCambio(IViajero viajero, double dinero) {
        viajero.convertirDinero(dinero, this);
    }
}
