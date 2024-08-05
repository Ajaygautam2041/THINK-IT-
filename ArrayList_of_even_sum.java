import java.util.ArrayList;

public class ArrayList_of_even_sum {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers= new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(6);
        Numbers.add(7);
        Numbers.add(8);
        Numbers.add(9);
        Numbers.add(10);
        int sum=0;
        for(int number: Numbers){
            if(number%2==0){
                sum=sum+number;

            }

        }
        System.out.println("sum is :"+sum);

    }
}
