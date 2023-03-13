package visitor.practica;

public class Turista implements IViajero{
    @Override
    public void convertirDinero(double euro, Europa europa) {

        System.out.println("Cantidad: €."+euro+" --> Bs."+euro*7.38);
        System.out.println("Cantidad: €."+euro+" --> $us."+euro*1.07);
        System.out.println("");
    }

    @Override
    public void convertirDinero(double dolar, EEUU eeuu) {
        System.out.println("Cantidad: $us."+dolar+" --> €."+dolar*0.94);
        System.out.println("Cantidad: $us."+dolar+" --> Bs."+dolar*6.96);
        System.out.println("");

    }

    @Override
    public void convertirDinero(double bolviano, Bolivia bolivia) {
        System.out.println("Cantidad: Bs."+bolviano+" --> $us."+bolviano*0.14);
        System.out.println("Cantidad: Bs."+bolviano+" --> €."+bolviano*0.13);
        System.out.println("");
    }
}
