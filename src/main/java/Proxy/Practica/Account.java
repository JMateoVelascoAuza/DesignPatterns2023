package Proxy.Practica;

public class Account implements IBank{

    private String owner;
    private int number;
    private double balance;

    public Account(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public void showAccount(){
        System.out.println("*** Cuenta Bancaria ***");
        System.out.println("Nro Cuenta: "+number);
        System.out.println("Propietario: "+owner);
        System.out.println("Balance: "+balance);
        System.out.println();
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    private void showBalance(){
        System.out.println("Su balance actual es de "+balance+" bolivianos");
    }

    public void addMoney(double amount){
        balance += amount;
        System.out.println("El monto de "+amount+" bolivianos fue agregado a su cuenta");
        showBalance();
    }

    @Override
    public void withdraw(double amount, Currency currency) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Usted ha retirado "+amount+" bolivianos de su cuenta");
            showBalance();
        } else {
            System.out.println("Los fondos de su cuenta son insuficientes");
        }
    }
}
