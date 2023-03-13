package visitor.practica;

public interface IViajero {
    void convertirDinero(double dinero,Europa europa);
    void convertirDinero(double dinero,EEUU eeuu);
    void convertirDinero(double dinero, Bolivia bolivia);
}
