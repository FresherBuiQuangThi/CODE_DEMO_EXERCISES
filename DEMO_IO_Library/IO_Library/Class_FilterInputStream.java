package IO.Library;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Class_FilterInputStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileInputStream file = null;
        FilterInputStream filter = null;
        try {
            file = new FileInputStream(new File("D:\\FresherBuiQuangThi.txt"));
            filter = new BufferedInputStream(file);
 
            int k = 0;
            while ((k = filter.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        file.close();
        filter.close();

	}

}
