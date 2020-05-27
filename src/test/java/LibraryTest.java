import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book, book1;

    @Before
    public void setUp(){
        library = new Library(5);
        book1 = new Book("1984", "George Orwell", "Sci-Fi");
        book = new Book("Harry Potter", "J. K. Rowling", "Fantasy");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.countBooks());
    }

    @Test
    public void hasCapacity(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(5, library.countBooks());
    }

    @Test
    public void canCheckBook(){
        library.addBook(book1);
        assertEquals(true, library.containsBook(book1));
    }

    @Test
    public void doesNotHaveBook(){
        library.addBook(book1);
        assertEquals(false, library.containsBook(book));
    }

    @Test
    public void canGetAmountOfGenre(){
        library.addBook(book1);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getAmountGenre(book.getGenre()));
        assertEquals(1, library.getAmountGenre(book1.getGenre()));
    }
}
