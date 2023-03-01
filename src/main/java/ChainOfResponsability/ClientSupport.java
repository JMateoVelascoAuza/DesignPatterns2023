package ChainOfResponsability;

public class ClientSupport implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Fallas fallas) {
        Soporte soporte = new Soporte();
        PO po = new PO();
        QA qa = new QA();
        DEV dev = new DEV();

        this.setNext(soporte);
        soporte.setNext(po);
        po.setNext(qa);
        qa.setNext(dev);

        this.next.reportarProblema(fallas);
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

}
