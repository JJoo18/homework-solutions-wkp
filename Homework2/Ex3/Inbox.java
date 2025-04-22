package Homework2.Ex3;

public class Inbox {
    private Mail[] mails;
    public void printHeader() {
        for (int i = 0; i < mails.length; i++) {
            System.out.println("Index: " + i +  " | Read: " + mails[i].isRead() + " | Subject: " + mails[i].getSubject() + " | Sender: " + mails[i].getSender() + " | Datetime: " + mails[i].getDatetime());
        }
    }

    public void open(int index) {
        if (index > mails.length) {
            System.out.println("Index too high!");
            return;
        }
        System.out.println(mails[index].getMessage());
    }

    public int countUnread() {
        int count = 0;
        for (Mail mail : mails) {
            if (!mail.isRead()) count += 1;
        }
        return count;
    }

    public Mail[] getMails() {
        return mails;
    }

    public void setMails(Mail[] mails) {
        this.mails = mails;
    }
}
