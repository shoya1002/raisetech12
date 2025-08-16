import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        //書籍登録
        library.addBook(new Book("Java入門", "山田太郎", "001"));
        library.addBook(new Book("Python入門", "佐藤花子", "002"));
        library.addBook(new Book("Java中級", "山田太郎", "003"));

        Scanner scanner = new Scanner(System.in);


        //タイトル検索
        System.out.print("検索するタイトルを入力してください：");
        String titleInput = InputNormalizer.nomalize(scanner.nextLine());
        List<Book> titleResults = library.searchByTitle(titleInput);
        if (titleResults.isEmpty()){
            System.out.println("該当する書籍はありません。");
        }else{
            for (Book book : library.searchByTitle(titleInput)) {
            System.out.println(book);
             }
        }
        //著者検索
        System.out.print("検索する著者名を入力してください：");
        String authorInput = InputNormalizer.nomalize(scanner.nextLine());
        List<Book> authorResults = library.searchByAuthor(authorInput);
        if(authorResults.isEmpty()){
            System.out.println("該当する書籍がありません。");
        }else{
            for (Book book : authorResults) {
                System.out.println(book);
            }
        }

        //番号検索
        System.out.print("\n検索する番号を入力してください：");
        String numberInput = InputNormalizer.nomalize(scanner.nextLine());
        Book numberResults = library.searchByNumber(numberInput);
        if (numberResults !=null) {
            System.out.println(numberResults);
        }else{
            System.out.println("該当する書籍はありません。");
        }

        scanner.close();
    }
}

