package Arraypackage.com;
import java.util.*;
public class AscendingOrder {
    public static void main(String[] args) {
        int arr[]= new int [5];
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements in array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++)
            {
                if (arr[i] > arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;

                }
            }

        }
        System.out.println("=========>  ascending order of entered array  <========");
        for(int i=0;i<5;i++){
            System.out.print(arr[i] +" ");
        }


    }
}
