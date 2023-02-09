package singleton.practica;

public class Clientes {
    private String nombre;
    private int nit;
    private int descuento;

    public Clientes(String nombre, int nit){
        this.nombre = nombre;
        this.nit = nit;
    }

    public void guardarCliente(){
        Logger.getInstance().write("CLIENTE GUARDADO: "+nombre+"con numero de NIT: "+nit);
    }

    public void codigoDeDescuento(int descuento){
        if(descuento == 888){
            Logger.getInstance().write("Obtuvo el descuento del 20%");
        }else if(descuento == 2905){
            Logger.getInstance().write("Obtuvo el descuento del 50%");
        }else{
            Logger.getInstance().write("ERROR: Codigo no registrado en la base de datos");
        }
    }

}
