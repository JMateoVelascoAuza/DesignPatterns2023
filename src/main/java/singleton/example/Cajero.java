package singleton.example;

public class Cajero {
    Cliente cliente;
    public Cajero(Cliente cliente){
        this.cliente = cliente;
    }

    public void retirarDinero(int amount){
        CuentaBancaria.getInstance().retirarDinero(amount);
    }
}
