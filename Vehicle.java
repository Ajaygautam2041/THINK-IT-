public class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;
    Vehicle( String make, String model, int year,int maximumSpeed){
        this.make= make;
        this.model=model;
        this.year=year;
        this.maximumSpeed=maximumSpeed;
    }
    void drive(){
        System.out.println("vehicle is driving");
    }
    public void display() {
            System.out.println("Make: " + make);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Maximum Speed: " + maximumSpeed + " km/h");
    }
}
class Car extends Vehicle{
    Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);


    }
    void drive(){
        System.out.println(make+" "+model+" "+"car is driving");
    }

}
 class Bike extends Vehicle{

     Bike(String make, String model, int year, int maximumSpeed) {

         super(make, model, year, maximumSpeed);
     }

     void drive(){
         System.out.println(make+" "+model+" "+"Bike is driving");
    }
 }
 class TestInheritance{
     public static void main(String[] args) {
        Car c=new Car("audi","z4",2019,220 );
         Bike b= new Bike("TVS motor","RTR-160",2006, 160 );
         c.display();
         b.display();
     }
 }
