package Proxy.Practica;

public class Client {
    public static void main(String[] args){
        // Account should be a singleton
        DebitCard dc = new DebitCard("Mauri");

        dc.showAccount();
        dc.deposit(100, Currency.USD);
        dc.showAccount();

        dc.withdraw(20, Currency.BOB);
        dc.withdraw(1, Currency.USD);
        dc.withdraw(30, Currency.GBP);
        dc.withdraw(50, Currency.EUR);
    }
}
