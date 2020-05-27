import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void setUp(){
        borrower = new Borrower("Alex");
        book = new Book("1984", "George Orwell", "Sci-Fi");
        library = new Library(5);
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canTakeBookFromLibrary(){
        library.addBook(book);
        borrower.takeBook(library, book);
        assertEquals(1, borrower.countBooks());
        assertEquals(0, library.countBooks());
    }
}
