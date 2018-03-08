package IO.Library;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class Class_SequenceInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input1 = null;
        FileInputStream input2 = null;
        SequenceInputStream inst = null;
        
        try {
            input1 = new FileInputStream("D:\\FresherBuiQuangThi.txt");
            input2 = new FileInputStream("D:\\FresherBuiQuangThi02.txt");
            inst = new SequenceInputStream(input1, input2);
            int j;
            while ((j = inst.read()) != -1) {
                System.out.print((char)j);
            }
        } catch (IOException ex) {
 
        } finally {
            inst.close();
            input1.close();
            input2.close();
        }

	}

}
