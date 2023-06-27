package Task1;

public class main {
   public static void main(String[] args) {
      Owner catsOwner = new Owner("Oleg");
      Cat cat1 = new Cat("Vasya", 3, catsOwner);
      cat1.greet();
   }
}
