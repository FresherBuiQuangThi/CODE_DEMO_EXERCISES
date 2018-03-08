package IO.Library;
import java.io.StringReader;

public class Class_StringReader {
	public static void main(String[] args) throws Exception {
        String srg = "Fresher Bui Quang Thi";
        StringReader reader = new StringReader(srg);
        int k = 0;
        while ((k = reader.read()) != -1) {
            System.out.print((char) k);
        }
    }
}
