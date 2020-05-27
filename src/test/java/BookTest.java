import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book("1984", "George Orwell", "Sci-Fi");
    }

    @Test
    public void bookHasName(){
        assertEquals("1984", book.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Sci-Fi", book.getGenre());
    }

}
