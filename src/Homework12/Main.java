package Homework12;

public class Main {
    public static void main(String[] args) {
        Author austen = new Author("Jane", "Austen");
        Author bronte = new Author("Emily", "Bronte");
        Book prideAndPrejudice = new Book("Pride And Prejudice", austen, 1813);
        Book wutheringHeights = new Book("Wuthering Heights", bronte, 1847);
        prideAndPrejudice.setPublicationYear(1901);
        System.out.println("prideAndPrejudice.getPublicationYear() = " + prideAndPrejudice.getPublicationYear());
    }
}
