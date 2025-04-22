package Homework2.Ex3;

public class MainEx3 {
    public static void main(String[] args) {
        Mail mail1 = new Mail();
        Mail mail2 = new Mail();
        Mail mail3 = new Mail();
        mail1.setDatetime("2025/03/12-14:33:22");
        mail1.setRead(true);
        mail1.setMessage("Hallo, was geht");
        mail1.setSender("Bernd");
        mail1.setSubject("Gehen");
        mail2.setDatetime("2022/12/02-11:13:21");
        mail2.setRead(true);
        mail2.setMessage("Essen kaufen?");
        mail2.setSender("Pedro");
        mail2.setSubject("Mangiare");
        mail3.setDatetime("2024/09/09-02:16:29");
        mail3.setRead(false);
        mail3.setMessage("Ich bin in Norwegen");
        mail3.setSender("Halftar");
        mail3.setSubject("Urlaub");

        Inbox inbox = new Inbox();
        inbox.setMails(new Mail[]{mail1, mail2, mail3});

        inbox.countUnread();
        inbox.open(2);
        inbox.printHeader();
    }
}
