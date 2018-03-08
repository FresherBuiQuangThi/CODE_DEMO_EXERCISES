import java.util.ArrayList;

public class Tuan03_Bai03 {
    public static void main(String args[]) {
        // Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to arraylist  
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Android");
        list.add("C#");
        
        showList(list);
        
        // addAll()
        ArrayList<String> listA = new ArrayList<String>();
        listA.addAll(list);       
        showList(listA);
 
        // retainAll() listA
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("C++");
        listA.retainAll(listB);    
        showList(listA);
 
        // removeAll() listA
        listA.removeAll(listA);  
        if(listA.size() <= 0){
        	System.out.println("\nList đã được remove hết!!!");
        }
        else{
        	showList(listA);
        }
    }
    
    public static void showList(ArrayList<String> arrayList){
    	// Show list through index
        System.out.println();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
    }
}
