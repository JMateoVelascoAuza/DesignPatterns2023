package singleton.example;

public class WebApp {
    Cliente cliente;
    public WebApp(Cliente cliente){
        this.cliente = cliente;
    }

    public void retirarDinero(int amount){
        CuentaBancaria.getInstance().retirarDinero(amount);
    }
}
