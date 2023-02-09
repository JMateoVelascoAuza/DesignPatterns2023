package singleton.example;

public class Sucursal {
    Cliente cliente;
    public Sucursal(Cliente cliente){
        this.cliente = cliente;
    }

    public void retirarDinero(int amount){
        CuentaBancaria.getInstance().retirarDinero(amount);
    }
}
