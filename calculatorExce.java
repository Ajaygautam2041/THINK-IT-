import java.util.*;
public class calculatorExce {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the two Number ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Please enter the operator ");
        char operator =sc.next().charAt(0);
        switch (operator){
            case'+':
                System.out.println("addition is :"+(num1+num2));
                break;
            case'-':
                System.out.println("subtraction is :"+(num1-num2));
                break;
            case'*':
                System.out.println("multiplication is :"+(num1*num2));
                break;
            case'/':
                if(num2!=0){
                    System.out.println("division is :"+(num1/num2));

                }
                else{
                    System.out.println("Error :  Arithmetic Exception Division by zero not allowed ");
                }
                break;
            default:
                System.out.println("entered the invalid operator");

        }

    }
}
