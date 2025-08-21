
class Book {
    String isbn;
    String author;
    String titleName;
    boolean isBorrowed;
    static int totalBooks = 0;

    Book(String isbn, String author, String titleName) {
        this.isbn = isbn;
        this.author = author;
        this.titleName = titleName;
        totalBooks++;
    }

    Book(String isbn) {
        this(isbn, "unknown", "unknown");
    }

    public static int getTotalBook() {
        return totalBooks;
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("already borrowed");
        } else {
            this.isBorrowed = true;
            totalBooks--;
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            totalBooks++;
        } else {
            System.out.println("Already given");
        }
    }
}

public class ClassPractice {
    public static void main(String[] args) {
        Book toc = new Book("1", "Yash", "ToC");
        Book dbms = new Book("2", "Yashi", "DBMS");
        Book os = new Book("3");
        System.out.println(Book.getTotalBook()); 
        toc.borrowBook();
        System.out.println(Book.getTotalBook()); 
        toc.returnBook();
        toc.borrowBook();
        dbms.borrowBook();
        os.borrowBook();
        System.out.println(Book.getTotalBook()); 
    }
}
