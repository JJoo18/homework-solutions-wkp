package Homework3.Ex1DifferentPackage;

import Homework3.Ex1.Account;

public class CompanyAccount extends Account {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "neuer Owner";
        account.setPin(1234, 5678);
        account.setInternalNote("Internal Note");
        account.getBalance();
    }
}
