import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Class_HashTable {

   public static void main(String args[]) {
	  // Create 1 HashTable
	  Hashtable<String, Double> hashtable = new Hashtable<String, Double>();
	  double money;
	
	  hashtable.put("Tinh", 15000.5);
	  hashtable.put("Chi", 50000.5);
	  hashtable.put("Thien", 20000.5);
	  hashtable.put("Thi", 100000.5);
	  hashtable.put("Ngoc", 2000000.5);
	  

	  //Entry returns each pair of data consisting of Key and Value
	  System.out.println("Số tiền từng thành viên là:");
	  System.out.println("===================================================");
	  for(Entry<String, Double> entry : hashtable.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
	  }
	  // Send to Zara 1000 VND
	  money = ((Double)hashtable.get("Thi")).doubleValue();
	  
	  System.out.println("===================================================");
	  System.out.print("Sau khi them 10000 được so tien như sau:  ");
	  hashtable.put("Thi", new Double(money + 10000));
	  System.out.println(hashtable.get("Thi"));
   }
}