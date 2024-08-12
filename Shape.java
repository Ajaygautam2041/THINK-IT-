import java.util.zip.CheckedInputStream;

public class Shape {
    double getArea(){
        System.out.println("square shape");
        return 0.0;}

}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
     public  double getArea(){
        return Math.PI*radius*radius;

    }
}
  class Square{
  double length;
  Square(double length){
      this.length=length;
  }
  public double getArea(){
      return length*length;
  }
 }
 class Rectangle extends Shape{
    double height ;
     double width;
    Rectangle(double height , double width){
        this.height= height;
        this.width=width;

    }
    public double getArea(){
        return height*width;
    }
 }
 class TestArea{
     public static void main(String[] args) {
         Circle c=new Circle(15);
         Square s=new Square(5.5);
         Rectangle r=new Rectangle(10.2,12.5);
         System.out.println("are of circle is :"+c.getArea());
         System.out.println("area of square is :"+s.getArea());
         System.out.println("area of rectangle is :"+r.getArea());

     }
 }
