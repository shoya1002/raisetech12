import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        //書籍登録
        library.addBook(new Book("Java入門", "山田太郎", "001"));
        library.addBook(new Book("Python入門", "佐藤花子", "002"));
        library.addBook(new Book("Java中級", "山田太郎", "003"));


        //タイトル検索
        System.out.println("タイトルで検索:　Java入門");
        List<Book> titleResults = library.searchByTitle("Java入門");
        for (Book book : titleResults) {
            System.out.println(book);
        }
        //著者検索
        System.out.println("\n著者で検索:　山田太郎");
        List<Book> authorResults = library.searchByAuthor("山田太郎");
        for (Book book : authorResults) {
            System.out.println(book);
        }

        //番号検索
        System.out.println("\n番号で検索:　002");
        Book numberResults = library.searchByNumber("002");
        if (numberResults !=null) {
            System.out.println(numberResults);
        }else{
            System.out.println("該当する書籍はありません。");
        }
    }
}

