import java.util.HashSet;

public class Hashset_Operation {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet();
        hs.add(5);
        hs.add(10);
        hs.add(15);
        hs.add(20);
        hs.add(25);
        System.out.println("element of the set :"+ hs );
        System.out.println("===========================");
        System.out.println(hs.contains(10));
        System.out.println("===========================");
        System.out.println(hs.remove(15));
        System.out.println("after the remove of 15: " +hs);
        System.out.println("===========================");
        System.out.println("size of the set :"+ hs.size());
        System.out.println(hs);

    }
}
