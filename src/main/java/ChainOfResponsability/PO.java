package ChainOfResponsability;

public class PO implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Fallas fallas) {
        if(fallas.getSeveridad().equals("MEDIA")){
            fallas.show();
            System.out.println("Los PO's se estan encargando de resolver la falla");
            System.out.println();
            System.out.println();
        } else{
            System.out.println("La falla sera transferida a otra division. Los PO's no pueden con dicha falla");
            this.next.reportarProblema(fallas);
        }
    }


    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

}



