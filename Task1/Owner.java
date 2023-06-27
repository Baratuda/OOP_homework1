package Task1;

// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
//  и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>.
//   Мне <возраст> года(лет). Мой владелец - <имя владельца>.".
public class Owner{
   private String name;

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Owner(String name) {
      this.name = name;
   }

}