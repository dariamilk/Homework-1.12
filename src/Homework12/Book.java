package Homework12;

public class Book {
    private String bookTitle;
    private Author author;
    private int publicationYear;
    public Book (String bookTitle, Author author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getBookTitle () {
        return bookTitle;
    }
    public String getAuthor () {
        return author.getFirstName() + " " + author.getLastName();
    }
    public int getPublicationYear () {
        return publicationYear;
    }
    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
