package comparator_demo;

import java.util.Comparator;

public class sort_by_name implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Car c=(Car)o1;
        Car c1=(Car)o2;
        int i=c.name.compareTo(c1.name);
        return i;
    }

}
