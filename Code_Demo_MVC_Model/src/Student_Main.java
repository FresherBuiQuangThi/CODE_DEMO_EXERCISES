
public class Student_Main {
	
	// Get data from the database to process
	public static Student retriveStudentFromDatabase(){
		Student student = new Student();
		student.setMssv("2001140242");
		student.setHoTen("Bùi Quang Thi");
		student.setGioiTinh("Nam");
		student.setNamSinh(1996);
		student.setEmail("thibui880@gmail.com");
		student.setLopHoc("05DHTH1");
		student.setDiaChi("28 Nhật Tảo, phường 3, quận 10, TPHCM");
		student.setdTB(2.40);
		return student;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fetch student record based on his roll no from the database
	     Student model  = retriveStudentFromDatabase();

	      
	      //Create a view : to write student details on console
	      Student_View view = new Student_View();

	      Student_Controller controller = new Student_Controller(model, view);

	      //update model data
	      controller.setStudent_MSSV("2001140242");      
	      controller.updateView();
	}
}
