package Task3;
import java.util.Objects;
public class Book {
   private String title;
   private String author;
   private boolean available;

   public Book(String title, String author, boolean available) {
      this.title = title;
      this.author = author;
      this.available = available;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getAuthor() {
      return this.author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public boolean isAvailable() {
      return this.available;
   }

   public boolean getAvailable() {
      return this.available;
   }

   public void setAvailable(boolean available) {
      this.available = available;
   }
   public void displayInfo(){
      System.out.printf("Title = %s, Author = %s, Available = %b;", title,author,available);
   }
   

   @Override
   public String toString() {
      return "{" +
         " title='" + getTitle() + "'" +
         ", author='" + getAuthor() + "'" +
         ", available='" + isAvailable() + "'" +
         "}";
   }

}
