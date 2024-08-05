package string.com;

public class stringBuffer {
    public static void main(String[] args) {
        String str="Ajay";
        String rev="";
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(rev.toString());
        System.out.println(sb);

    }
}
