
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashTable_class {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// TODO Auto-generated method stub				
		
		System.out.println("Demo HashMap");
		System.out.println("===================================================");
		System.out.println("Trước khi remove key 3 được kết quả như sau:");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Put data to HashMap
		map.put(1, "Thiện");
		map.put(3, "Ngọc");
		map.put(2, "Thi");
		map.put(6, "Tỉnh");
		map.put(5, "Chi");
				
		//Entry returns each pair of data consisting of Key and Value
		for(Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Remove 1 row
		System.out.println("===================================================");
		System.out.println("Sau khi remove key 3 được kết quả như sau:");
		map.remove(3);
		//Entry returns each pair of data consisting of Key and Value
		for(Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Remove all row
		System.out.println("===================================================");
		System.out.println("Sau khi all data được kết quả như sau:");
		map.clear();
		//Entry returns each pair of data consisting of Key and Value
		for(Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		//Demo data in Person Class
		Map<String, Person> mapPerSon = new HashMap<String, Person>();
		
		mapPerSon.put("B", new Person(2));
		mapPerSon.put("A", new Person(1));
			
		System.out.println("===================================================");
		System.out.println("Demo trên lớp Person:");
		//Entry returns each pair of data consisting of Key and Value
				for(Entry<String, Person> entry : mapPerSon.entrySet()){
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
		
		
		
	}
}
