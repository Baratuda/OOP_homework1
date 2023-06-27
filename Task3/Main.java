package Task3;

public class Main {
   public static void main(String[] args) {
    Book book = new Book("title","author",true);
    Book book2 = new Book("title2","author2",true);
    Book book3 = new Book("title3","author3",false);
    Book book4 = new Book("title4","author4",false);
    Book book5 = new Book("title5","author5",true);
    Book book6 = new Book("title6","author6",true);
    Libriary libriary = new Libriary();
    libriary.addBook(book);
    libriary.addBook(book2);
    libriary.addBook(book3);
    libriary.addBook(book4);
    libriary.addBook(book5);
    libriary.addBook(book6);
    libriary.displayAvailableBooks();
    libriary.searchByAuthor("author2");
   }
}
