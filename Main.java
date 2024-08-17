package comparator_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Car a=new Car(2002,"wagonour",160);
        Car a1=new Car(2008,"nano",120);
        Car a2=new Car(2006,"maruti",180);
        Car a3=new Car(2004,"mercedese",300);
        Car a4=new Car(2000,"BMW",350);
        ArrayList ts=new ArrayList<>();
        ts.add(a);
        ts.add(a1);
        ts.add(a2);
        ts.add(a3);
        ts.add(a4);
        Collections.sort(ts,new sort_by_name());
        Collections.sort(ts,new sort_by_year());
        System.out.println(ts);
    }
}
