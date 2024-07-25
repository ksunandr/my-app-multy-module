package org.example;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author1) {
        this.title = title;
        this.author = author1;
    }

    public String getTitle() {
        return title;
    }

   public String getTitle2() {
        return title;
    }
       public String getTitle3() {
        return title;
    }
       public String getTitle4() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

