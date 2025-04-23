package Homework3.Ex2;

public class Message {
    public String getType() {
        return "Generic";
    }

    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();
        System.out.println(m1.getType());
        System.out.println(m2.getType());
        if (m1 instanceof Email) {
            ((Email) m1).send();
        }

    }
}
