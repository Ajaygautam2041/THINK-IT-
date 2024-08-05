package Arraypackage.com;

import java.util.ArrayList;

public class errorDemo {
    public static void main(String[] args) {
        ArrayList<byte[]> list =new ArrayList<>();
        while(true){
            byte[] b =new byte[1024*1024];
            list.add(b);
        }
    }
}
