package lv.lu.training.lesson7;

public class Book {

    private String title;
    private String author;

    private static int booksOnShelf;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        booksOnShelf++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static int getBooksOnShelf() {
        return booksOnShelf;
    }

    @Override
    public String toString() {
        return "Nosaukums: " + title + "-- Autors: " + author;
    }

    public static void main(String[] args) {
        System.out.println("Grāmatas plauktā : " + Book.getBooksOnShelf());

        Book firstBook = new Book("Mana ģimene un citi zvēri", "Džeralds Darels");
        System.out.println("Grāmatas plauktā : " + Book.getBooksOnShelf());

        Book secondBook = new Book("Clean Code", "Robert C. Martin");
        System.out.println("Grāmatas plauktā : " + Book.getBooksOnShelf());

        System.out.println(firstBook);
        System.out.println(secondBook);


    }


}
