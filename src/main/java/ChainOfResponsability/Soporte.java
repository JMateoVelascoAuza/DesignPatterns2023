package ChainOfResponsability;

public class Soporte  implements IHandler {

    private IHandler next;

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reportarProblema(Fallas fallas) {
        if(fallas.getSeveridad().equals("BAJA")){
            fallas.show();
            System.out.println("Soporte se esta encargando de resolver la falla");
            System.out.println();
            System.out.println();
        } else{
            System.out.println("La falla sera transferida a otra division. Soporte no puede con dicha falla");
            this.next.reportarProblema(fallas);
        }

    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

}
