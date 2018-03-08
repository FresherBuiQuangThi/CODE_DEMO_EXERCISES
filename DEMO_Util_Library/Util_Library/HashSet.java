import java.util.*;
public class Class_HashSet {

   public static void main(String args[]) {
      // Create new hashset
      HashSet hs = new HashSet();
      // them cac phan tu toi hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      // F find in hashset 2 time but when print to dislay only 1 time
      hs.add("F");
      hs.add("F");
      
    //Entry returns each pair of data consisting of Key and Value
	  System.out.println("Các phần tử trong HashSet là:");
	  System.out.println("===================================================");
      System.out.println(hs);
      
    //Remove 1 row
	System.out.println("===================================================");
	System.out.println("Sau khi remove A được kết quả như sau:");
	hs.remove("A");
	System.out.println(hs);
	
	//Remove all row
	System.out.println("===================================================");
	System.out.println("Sau khi all data được kết quả như sau:");
	hs.clear();
   }
}