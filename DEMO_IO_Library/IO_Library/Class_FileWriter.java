package IO.Library;
import java.io.FileWriter;

public class Class_FileWriter {
	 public static void main(String args[]) {
	        try {
	            FileWriter fw = new FileWriter("D:\\FresherBuiQuangThi02.txt");
	            fw.write("Welcome to java.");
	            fw.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        System.out.println("Gửi Thành Công!!!");
	 }
}
