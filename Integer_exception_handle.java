import java.util.*;
public class Integer_exception_handle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer value");
        int value=sc.nextInt();
        System.out.println("entered integer value: "+value);
        try{
            if(value!=sc.nextInt()){
                System.out.println("print non-integer value");
            }

        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}
