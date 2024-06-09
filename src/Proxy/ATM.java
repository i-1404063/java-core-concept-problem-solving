package Proxy;

public class ATM implements Account {

    @Override
    public void withdraw() {
        BankAccount account = new BankAccount();
        account.withdraw();
    }

    @Override
    public void getAccountNumber() {

    }

}
