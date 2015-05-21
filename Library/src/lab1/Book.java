package lab1;

/**
 * A representation of a book.
 *
 * @author Goutam Kundu & Francisco Latacel.
 */
public class Book {

    /**
     * This book's title.
     */
    private String title;

    /**
     * True if this book is borrowed and false otherwise.
     */
    private boolean borrowed;

    /**
     * Creates a new Book.
     *
     * @param bookTitle The title of the book that will be created.
     */
    public Book(String bookTitle) {
        title = bookTitle;
        borrowed = false;
    }

    /**
     * Marks this book as rented.
     */
    public void rented() {
        borrowed = true;
        System.out.println("Sorry, This book is rented");
    }

    /**
     * Marks this book as not rented.
     */
    public void returned() {
        borrowed = false;
        System.out.println("This book is not rented, you can take it");
    }

    /**
     * Returns true if this book is rented, false otherwise.
     *
     * @return true if this book is rented and false otherwise.
     */
    public boolean isBorrowed() {
        return borrowed;
    }

    /**
     * Returns this book's title as a String.
     *
     * @return This book's title as a String.
     */
    public String getTitle() {
        return title;
    }

    public static void main(String[] arguments) {

        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        System.out.println("Rented? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        System.out.println("Rented? (should be true): " + example.isBorrowed());
    }
}
