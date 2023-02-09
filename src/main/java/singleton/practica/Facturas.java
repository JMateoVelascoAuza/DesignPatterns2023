package singleton.practica;

public class Facturas {
    private int nit;
    private double precio;
    public Facturas(int nit, double precio){
        this.nit = nit;
        this.precio = precio;
    }

    public void facturar(){
        Logger.getInstance().write("Se realizo la factura al nit: "+nit+" con el precio de: Bs."+precio);
    }
    public void impuesto(){
        Logger.getInstance().write("El impuesto que la tienda tiene que pagar por la factura es de: "+ precio*0.13);
    }

}
