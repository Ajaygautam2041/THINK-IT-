import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Reverse_String_List {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("Hii");
        str.add("My");
        str.add("Name");
        str.add("is");
        str.add("Ajay");

        System.out.println("print before reverse string List item  :"+str);
        Collections.reverse(str);
        System.out.println("print After reverse string list item  :"+ str);
    }
}
