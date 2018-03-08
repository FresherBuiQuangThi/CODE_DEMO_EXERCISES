package IO.Library;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class_ByteArrayInputStream {
	public static void main(String[] args) throws IOException {
		
        ByteArrayInputStream bis = null;
        try {
            byte[] ascii = { 65, 66, 67, 68 };
            // Create the new byte array input stream
            bis = new ByteArrayInputStream(ascii);
            int k = 0;
            while ((k = bis.read()) != -1) {
                // Conversion of a byte into character
                char ch = (char) k;
                System.out.println("Mã ASCII là:" + k + "---Tương ứng với ký tự----" + ch);
            }
        } finally {
            bis.close();
        }
	}
}
