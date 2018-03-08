import java.util.*;
import java.util.Date;
public class Class_DateTime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         long start = System.currentTimeMillis( );
	         System.out.println(new Date( ) + "\n");
	         Thread.sleep(5*60*10);
	         System.out.println(new Date( ) + "\n");
	         long end = System.currentTimeMillis( );
	         long diff = end - start;
	         System.out.println("Thời gian để chạy là: " + diff);
	      } catch (Exception e) {
	         System.out.println("Nhan mot exception!");
	      }
	}
}
