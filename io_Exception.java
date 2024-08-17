import java.io.FileReader;
import java.io.IOException;

public class io_Exception {
    public static void main(String[] args)throws IOException {
        try {
            FileReader f = new FileReader("ajay.txt");
            System.out.println(f.read());
        }
        catch (Exception e){
            System.out.println(e);
            e.getStackTrace();
        }
        System.out.println("rest of the code");
    }
}
