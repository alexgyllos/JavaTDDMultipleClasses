import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.collection.size();
    }

    public void takeBook(Library library, Book book) {
        if (library.containsBook(book)){
            library.removeBook(book);
            this.collection.add(book);
        }
    }
}
