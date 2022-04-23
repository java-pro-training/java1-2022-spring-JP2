package lv.lu.training.hvz;

public class Book {

    private String title;
    private String author;
    private int pages;
    private String language;
    private boolean interesting;

    public Book (String title, String author, int pages, String language, boolean interesting) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.language = language;
        this.interesting = interesting;

    }
    public Book (String title, String author) {
        this.title = title;
        this.author = author;

    }

    public Book () {
    this.title = "unknown";
    this.author = "unknown";
    }

    public String getFullInformaton() {
        return title + " " + author + " " + " " + pages + " " +  language + " " + interesting;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle (String title) {
        this.title = title;
}
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public boolean getInteresting(){
        return interesting;
    }
    public void setInteresting(boolean interesting) {
        this.interesting = interesting;
    }



}