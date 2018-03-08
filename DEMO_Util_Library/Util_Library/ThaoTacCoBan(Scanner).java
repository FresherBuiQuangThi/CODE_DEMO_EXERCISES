
import java.util.Scanner;
import java.util.Date;
public class Tuan03_Bai02 {
	private static Scanner scanner = new Scanner(System.in);	
	private static Date date = new Date(); 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hôm nay là ngày: " +  date.toString());
    	System.out.println("=================================================");
        System.out.print("Nhập hệ số a = ");
        float a = Tuan03_Bai02.scanner.nextFloat(); 
        System.out.print("Nhập hệ số b = ");
        float b = Tuan03_Bai02.scanner.nextFloat();
        System.out.print("Nhập c = ");
        float c = scanner.nextFloat();
        Tuan03_Bai02.giaiPTBac2(a, b, c);   
        System.out.println("=================================================");
	}
	
	 public static void giaiPTBac2(float a, float b, float c) {
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình vô nghiệm!");                
	            } else {
	                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
	            }
	            return;
	        }
	        
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        
	        if (delta > 0){
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	        
	    }

}
