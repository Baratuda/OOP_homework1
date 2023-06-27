package Task1;


// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
//  и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>.
//   Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

public class Cat{
   private String name;
   private int age;
   private Owner catsOwner;

   public Cat(String name, int age, Owner catsOwner) {
      this.name = name;
      this.age = age;
      this.catsOwner = catsOwner;
   }

    public Owner getCatsOwner() {
      return this.catsOwner;
   }

   public void setCatsOwner(Owner catsOwner) {
      this.catsOwner = catsOwner;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }
   
   public void greet(){
     System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет).Мой владелец - %s.", name, age, catsOwner.getName());
   }
}