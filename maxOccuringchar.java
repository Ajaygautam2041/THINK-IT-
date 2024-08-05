package string.com;

public class maxOccuringchar {
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(str);

        int n=str.length();
        int []arr = new int[126];

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            arr[ch]=arr[ch]+1;
        }
        int max=-1;

        char maxchar='0';
        for(int i=0;i<126;i++){
            if(arr[i]>max ){
                max=arr[i];
                maxchar=(char)i;
            }
        }
        System.out.println(maxchar);
    }
}
