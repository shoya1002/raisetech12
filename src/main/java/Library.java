import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // 書籍追加
    public void addBook(Book book) {
        books.add(book);
    }

    // タイトルで検索
    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    // 著者で検索
    public List<Book> searchByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                results.add(book);
            }
        }
        return results;
    }

    // 番号で検索
    public Book searchByNumber(String number) {
        for (Book book : books) {
            if (book.getNumber().equals(number)) {
                return book;
            }
        }
        return null;
    }
}
