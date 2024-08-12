import java.util.SortedSet;
import java.util.TreeSet;

public class method_Of_Sorted_Set {
    public static void main(String[] args) {
        SortedSet ss=new TreeSet();
        ss.add("aaa");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        ss.add("eee");
        ss.add("fff");
        System.out.println(ss);
        System.out.println("============================");
        System.out.println(ss.first());
        System.out.println(ss);
        System.out.println("=============================");
        System.out.println(ss.last());
        System.out.println(ss);
        System.out.println("=============================");
        System.out.println(ss.headSet("ddd"));
        System.out.println(ss);
        System.out.println("=============================");
        System.out.println(ss.tailSet("ddd"));
        System.out.println(ss);
        System.out.println("=============================");
        System.out.println(ss.subSet("aaa","ddd"));
        System.out.println(ss);


    }
}
