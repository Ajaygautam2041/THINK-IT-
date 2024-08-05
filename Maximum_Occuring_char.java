public class Maximum_Occuring_char {
    public static void main(String[] args) {
        String str= "alomax";
        int []arr= new int[127];
        int n=str.length();
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            arr[c]=arr[c+1];
        }
        int max=-1;
        char maxchar='0';
        for(int i=0;i<127;i++){
            if(arr[i]>maxchar){
                max=arr[i];
                maxchar=(char)i;
            }
        }

    }
}
