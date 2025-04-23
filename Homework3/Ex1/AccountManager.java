package Homework3.Ex1;

public class AccountManager {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "neuer Owner";
        account.pin = 1234;
        account.internalNote = "567";
        account.getBalance();
    }

}
