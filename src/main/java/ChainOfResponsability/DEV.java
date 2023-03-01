package ChainOfResponsability;

public class DEV implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Fallas fallas) {
        if(fallas.getSeveridad().equals("CRITICA")){
            fallas.show();
            System.out.println("Los DEV's se estan encargando de resolver la falla");
            System.out.println();
            System.out.println();
        } else{
            System.out.println("La falla sera transferida a otra division. Los DEV's no pueden con dicha falla");

        }

    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }
}
