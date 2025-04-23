package Homework2.Ex1;

public class Textbook extends Book {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return getTitle() + ", published in " + getYear() + ", by " + getAuthor() + " Subject: " + subject;
    }
    public static void main(String[] args) {
        Textbook textbook = new Textbook();
        textbook.setTitle("Data Structures");
        textbook.setAuthor("Jane Doe");
        textbook.setSubject("Computer Science");
        textbook.setYear(2020);

        System.out.println(textbook.getInfo());
    }
}
