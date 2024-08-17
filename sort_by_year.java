package comparator_demo;

import java.util.Comparator;

public class sort_by_year implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Car c=(Car)o1;
        Car c1=(Car)o2;
        Integer i1=c.year;
        Integer i2=c1.year;
        int i=i1.compareTo(i2);
        return i;
    }
}
