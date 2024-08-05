import java.util.*;
public class NumFormatException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String ");
        try {
            String str = sc.nextLine();
            if(str==null){
                throw new NullPointerException("this is empty string");
            }
            int number= Integer.parseInt(str);
            System.out.println("entered number is:"+number);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format. Please enter a valid integer.");

        }
        catch(NullPointerException s){
            System.out.println("Input cannot be null. Please enter a valid integer.");
        }
    }
}
