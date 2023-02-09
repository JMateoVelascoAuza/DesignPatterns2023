package singleton.example;

public class CuentaBancaria {
    //Atributo del mismo tipo
    private static CuentaBancaria instance = null;
    private int saldo = 1000;



    private CuentaBancaria(){
        saldo = 100;
        System.out.println("INFO > Saldo inical: " + saldo);
    }

    //Acceso Global
    public static CuentaBancaria getInstance(){
        if (instance == null)
            instance = new CuentaBancaria();
        return instance;
    }
    public synchronized void retirarDinero(int amount){
        if (amount <= saldo){
            saldo = saldo - amount;
            System.out.println("INFO> operacion satisfactoria: Cantidad a retirar: " + amount + ", el saldo que tiene: "+saldo);
        }else {
            System.out.println("ERROR> no se puede retirar esa cantidad: " + amount+ ", el saldo que tiene: " + saldo);
        }
    }
}
