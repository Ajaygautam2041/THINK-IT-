import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any string ");
        String str= sc.nextLine();
        String output= "";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            output= output+str.charAt(i);
        }
        if(str.equals(output)){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not pallindrome");
        }
    }
}


