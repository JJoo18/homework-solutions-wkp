package Homework2.Ex1;

public class Book extends Publication{
    private String author;
    @Override
    public String getInfo() {
        return getTitle() + " , published in " + getYear() + ", by "+ author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {

    }
}
