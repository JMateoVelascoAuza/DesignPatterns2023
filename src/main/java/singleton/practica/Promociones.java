package singleton.practica;

public class Promociones {
    private Productos productos;
    private int descuento;
    private boolean usado;
    public Promociones(Productos productos, int descuento){
        this.productos = productos;
        this.descuento = descuento;
    }
    public void aplicar(){
        Logger.getInstance().write("El producto: "+productos.nombre()+" con un descuento del: "+descuento+"%");
        usado = true;
    }
    public void descuentoUsado(){
        if(usado){
            Logger.getInstance().write("El descuento del producto: "+productos.nombre()+" ya fue usado, intente con otro");
        }else{
            Logger.getInstance().write("El descuento del producto: "+ productos.nombre()+" esta disponible y sera aplicado en su siguiente compra");
        }
    }

}
