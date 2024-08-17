package comparator_demo;

import java.util.Comparator;

public class Car{
    int year;
    String name;
    int speed;

    Car(int year, String name,int speed ){
        this.year=year;
        this.name=name;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
