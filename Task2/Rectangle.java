package Task2;



// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
public class Rectangle {
   private int width;
   private int height;

   public Rectangle() {
      this.width = 20;
      this.height = 30;
   }

   public int getWidth() {
      return this.width;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   public int getHeight() {
      return this.height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public int calculateArea(){
     return width * height;
   } 

   public int calculatePerimeter(){
      return (width + height)*2;
   }
}
