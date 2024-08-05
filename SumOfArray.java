package Arraypackage.com;

import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element is array");
        int n= sc.nextInt();
            int a[]= new int[n];

        System.out.println("enter the element in array");
        for(int i =0; i<n; i++){
            a[i]= sc.nextInt();
        }
        int sum=0;
        for(int i = 0; i<n; i++){
            sum =sum+a[i];
        }
        double avg=  (double)sum/n;
        System.out.println(sum);
        System.out.println(avg);
    }

}
