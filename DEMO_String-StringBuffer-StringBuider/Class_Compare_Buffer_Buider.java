package Java.Lang.Library;

public class Class_Compare_Buffer_Buider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============================================");
        
		
		// Test RunTime of StringBuffer
		long startTime1 = System.currentTimeMillis();  
        StringBuffer buffer = new StringBuffer("abc");
        
        for (int i=0; i<10000000; i++){  
            buffer.append("d");  
        }  
        System.out.println( "Time current is:  " + startTime1);
        System.out.println("Tốc độ xử lý StringBuffer là: " + (System.currentTimeMillis() - startTime1) + " ms");
        System.out.println("============================================");
        
        
        //Test RunTime of StringBuider
        long startTime2 = System.currentTimeMillis();  
        StringBuilder buider = new StringBuilder("abc"); 
		  
		for (int i=0; i<10000000; i++){  
		      buider.append("d");  
		}
		System.out.println( "Time current is:  " + startTime2);
		System.out.println("Tốc độ xử lý StringBuilder là: " + (System.currentTimeMillis() - startTime2) + " ms");
		System.out.println("============================================");
    }  
}
