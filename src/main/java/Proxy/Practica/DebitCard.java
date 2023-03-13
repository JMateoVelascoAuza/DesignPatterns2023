package Proxy.Practica;

import java.util.Random;

public class DebitCard  implements IBank{

    private Account account;

    public DebitCard(String owner) {
        account = new Account(owner, new Random().nextInt(50000), 0);
    }

    public void showAccount(){
        account.showAccount();
    }

    public void deposit(double amount, Currency currency){
        Tuple<Double, Currency> t = currencyVerifier(amount, currency);
        account.addMoney(t.first);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private Tuple<Double, Currency> currencyVerifier(double amount, Currency currency){
        Currency currencyF = currency;
        double amountF = amount;
        if(!currency.equals(Currency.BOB)){
            currencyF = Currency.BOB;
            amountF = amount * Currency.rate(currency, currencyF);
        }
        return new Tuple<>(amountF, currencyF);
    }

    @Override
    public void withdraw(double amount, Currency currency) {
        Tuple<Double, Currency> t = currencyVerifier(amount, currency);
        account.withdraw(t.first, t.second);
    }
}
