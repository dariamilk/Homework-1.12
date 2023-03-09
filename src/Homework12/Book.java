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
    public Author getAuthor () {
        return author;
    }
    public int getPublicationYear () {
        return publicationYear;
    }
    public void setPublicationYear (int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString () {
        return "Название книги: " + bookTitle + ".\n" + author + "\n" + "Год публикации: " + publicationYear + ".";
    }
    @Override
    public boolean equals (Object other) {
       if (this.getClass() != other.getClass()) {
           return false;
       }
       Book book = (Book) other;
       return bookTitle.equals(book.bookTitle) && author.equals(book.author) && (publicationYear == book.publicationYear);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookTitle, author, publicationYear);
    }
}
