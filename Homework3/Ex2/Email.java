package Homework3.Ex2;

public class Email extends Message{
    public String getType() {
        return "Email";
    }

    public String send() {
        System.out.println("E-Mail sent");
        return "E-Mail Sent";
    }
}
