package IO.Library;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Class_BufferedInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
        BufferedInputStream bin = null;
 
        try {
        	//Default file thi.txt was exsist
            fin = new FileInputStream("D:\\FresherBuiQuangThi.txt");
            bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            bin.close();
            fin.close();
        }
    }
}
