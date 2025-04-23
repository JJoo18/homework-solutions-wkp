package Homework3.Ex1;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public String getInternalNote() {
        System.out.println("Note: " + internalNote);
        return internalNote;
    }

    public void setInternalNote(String internalNote) {
        this.internalNote = internalNote;
    }

    public double getBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }

    public void setPin(int originalPin, int newPin) {
        if (originalPin == pin) {
            pin = newPin;
            System.out.println("PIN changed to " + pin);
        }else {
            pin = originalPin;
            System.out.println("PIN was not changed");
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "penis";
        account.pin = 1234;
        account.internalNote = "Skrrr";
        account.balance = 500;
    }
}
