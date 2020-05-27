import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genres;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.genres = new HashMap<String, Integer>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (books.size() < capacity){
            this.books.add(book);
            Integer count = this.genres.get(book.getGenre());
            if (count == null) {
                this.genres.put(book.getGenre(), 1);
            } else {
                this.genres.put(book.getGenre(), count + 1);
            }
        }
    }

    public boolean containsBook(Book book){
        return this.books.contains(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public int getAmountGenre(String genre){
        return this.genres.get(genre);
    }
}
