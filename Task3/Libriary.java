
// Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:

// Класс "Книга" (Book):

// Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
// Приватное поле "доступность" (available) типа boolean для указания доступности книги.
// Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
// Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
// Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).

// Класс "Библиотека" (Library):
// Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
// Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
// Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
// Публичный метод "показать доступные книги" (displayAvailableBooks), который выводит на консоль информацию о доступных книгах в библиотеке.
// Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя автора в качестве параметра и выводит на консоль информацию о
//  книгах данного автора, находящихся в каталоге библиотеки.
package Task3;


import java.util.ArrayList;
import java.util.stream.Stream;

public class Libriary {
   ArrayList<Book> catalog;

   public Libriary() {
      this.catalog = new ArrayList <Book> ();
   }

   public ArrayList<Book> getCatalog() {
      return this.catalog;
   }

   public void setCatalog(ArrayList<Book> catalog) {
      this.catalog = catalog;
   }
   public void addBook(Book book){
      catalog.add(book);
   }
   public void removeBook(Book book){
       catalog.remove(book);
   }
   public void displayAvailableBooks(){
      System.out.println("Available Books: ");
      for (Book book : catalog) 
         if(book.isAvailable()) System.out.println(book.toString());
      
   }
   public void searchByAuthor(String authorName){
       System.out.println("Search by author: ");
       for (Book book : catalog) 
         if(book.getAuthor().equals(authorName)) System.out.println(book.toString());
      
   }
}

