package factoryMethod.practica;

public class PasajeSolidario implements IPasaje{
    private String nVuelo;
    private Lugar destino;
    private Lugar origen;
    private Avion avion;
    private Pasajero pasajero;
    private String nAsiento;
    private String precio;
    private double descuento;
    private String motivoDelDescuento;

    public String getnVuelo() {
        return nVuelo;
    }

    public void setnVuelo(String nVuelo) {
        this.nVuelo = nVuelo;
    }

    public Lugar getDestino() {
        return destino;
    }

    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

    public Lugar getOrigen() {
        return origen;
    }

    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(String nAsiento) {
        this.nAsiento = nAsiento;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDelDescuento() {
        return motivoDelDescuento;
    }

    public void setMotivoDelDescuento(String motivoDelDescuento) {
        this.motivoDelDescuento = motivoDelDescuento;
    }

    @Override
    public void comprar() {
        System.out.println("Realizando la compra...");
        System.out.print("Comprador:  ");
        pasajero.showInfo();
    }

    @Override
    public void showInfo() {
        System.out.println("_____________________________________");
        System.out.println("PASAJE SOLIDARIO");
        System.out.print("Pasajero: ");
        pasajero.showInfo();
        System.out.println("Numero de Vuelo: "+nVuelo);
        System.out.println("Numero de Asiento: "+nAsiento);
        System.out.println("Precio del Pasaje: "+precio);
        System.out.print("Origen: ");
        origen.showInfo();
        System.out.print("Destino: ");
        destino.showInfo();
        avion.showInfo();

    }
}
