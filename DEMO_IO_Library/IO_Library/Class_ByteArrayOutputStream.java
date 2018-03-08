package IO.Library;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class_ByteArrayOutputStream {
	public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = null;
        FileOutputStream fout2 = null;
        ByteArrayOutputStream bout = null;
 
        try {
            fout1 = new FileOutputStream("D:\\FresherBuiQuangThi.txt");
            fout2 = new FileOutputStream("D:\\FresherBuiQuangThi02.txt");
            bout = new ByteArrayOutputStream();
            String data = "Hello Fresher Bui Quang Thi";
            String data1 = "05DHTH1";
            bout.write(data.getBytes());
            bout.write(data1.getBytes());
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            System.out.println("Gứi thành công!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            fout1.close();
            fout2.close();
            bout.close();
        }
 
    }
}
