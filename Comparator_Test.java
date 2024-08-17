import java.util.ArrayList;
import java.util.Collections;

public class Comparator_Test {
    public static void main(String[] args) {
        Student1 s1=new Student1(2,"vikash");
        Student1 s2=new Student1(1,"ajeet");
        Student1 s3=new Student1(3,"raj");
        Student1 s4=new Student1(5,"karan");
        Student1 s5=new Student1(4,"indrajeet");
        ArrayList al=new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        Collections.sort(al,new sortByName());
        Collections.sort(al,new sort_By_Id());
        System.out.println(al);
    }
}
