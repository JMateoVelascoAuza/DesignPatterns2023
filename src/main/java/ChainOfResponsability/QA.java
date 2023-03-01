package ChainOfResponsability;

public class QA implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Fallas fallas) {
        if(fallas.getSeveridad().equals("ALTA")){
            fallas.show();
            System.out.println("Los QA's se estan encargando de resolver la falla");
            System.out.println();
            System.out.println();
        } else{
            System.out.println("La falla sera transferida a otra division. Los QA's no pueden con dicha falla");
            this.next.reportarProblema(fallas);
        }

    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
}
