package ChainOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void reportarProblema(Fallas fallas);
}
