package Homework3.Ex1DifferentPackage;

import Homework3.Ex1.Account;

public class ExternalAudit {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "neuer Owner";
        account.setPin(1234, 5678);
        account.getInternalNote();
        account.getBalance();
    }
}
