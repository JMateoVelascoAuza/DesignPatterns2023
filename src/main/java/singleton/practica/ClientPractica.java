package singleton.practica;

public class ClientPractica {
    public static void main(String[] args) {
        Thread cliente = new Thread(new Runnable() {
            @Override
            public void run() {
              Clientes clientes = new Clientes("Mateo", 300103);
              clientes.guardarCliente();
              clientes.codigoDeDescuento(888);
            }
        });

        Thread factura = new Thread(new Runnable() {
            @Override
            public void run() {
                Facturas facturas = new Facturas(888, 290.5);
                facturas.facturar();
                facturas.impuesto();
            }
        });

        Thread promocion = new Thread(new Runnable() {
            @Override
            public void run() {
                Promociones promociones = new Promociones(new Productos("Detergente ACE", "Limpieza"), 10);
                promociones.aplicar();
                promociones.descuentoUsado();
            }
        });
        Thread producto = new Thread(new Runnable() {
            @Override
            public void run() {
                Productos productos = new Productos("Queso San Javier", "Lacteo");
                productos.nombre();
                productos.inventariar();
            }
        });
    }
}
