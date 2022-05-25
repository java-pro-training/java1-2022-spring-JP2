package lv.lu.training.lesson7;

public class Book {
    private String title;
    private String author;
    private static int BooksOnShelf;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        BooksOnShelf++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: " + author;
    }

    public static void main(String[] args) {
        Book book1 = new Book("1st book", "1st author");
        Book book2 = new Book("2nd book", "2nd author");

        System.out.println(book1);
        System.out.println(book2);
    }


}
