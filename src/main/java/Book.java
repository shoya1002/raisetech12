public class Book {
   private String title;
   private String author;
   private String number;

   //コンストラクタ
    public Book (String title, String author,String number){
     this.title = title;
        this.author = author;
        this.number= number;
   }

   //getterメソッド
   public String getTitle() {
      return title;
   }
   public String getAuthor() {
      return author;
   }

   public String getNumber() {
      return number;
   }
@Override
   public String toString(){
       return "タイトル：" + title + ",著者：" + author +",番号：" + number;
   }
}
