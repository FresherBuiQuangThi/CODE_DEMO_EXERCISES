import java.util.ArrayList;

public class People {
	private String name;
    private int age;
    
    public People(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "People@[name=" + name + ", age=" + age + "]";
    }  
    /**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create listPeople
        ArrayList<People> listPeople = new ArrayList<People>();
        
        // Create peoples
        People people1 = new People("Tỉnh", 50);
        People people2 = new People("Chi", 45);
        People people3 = new People("Thiện", 23);
        People people4 = new People("Thi", 22);
        People people5 = new People("Ngọc", 18);
        
        // Add objects to listPeople
        listPeople.add(people1);
        listPeople.add(people2);
        listPeople.add(people3);
        listPeople.add(people4);
        listPeople.add(people5);
        
        // Show listPeople
        int size = listPeople.size();
        for(int i = 0; i<size; i++)
        	System.out.println(listPeople.get(i));
	}
}
