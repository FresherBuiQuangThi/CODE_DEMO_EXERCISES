
public class Student_Controller {
	private Student model;
	private Student_View view;
	
	public Student_Controller(Student model, Student_View view){
	      this.model = model;
	      this.view = view;
	}

	// Create funtion get,set from Model MSSV
	 public void setStudent_MSSV(String mssv){
	      model.setMssv(mssv);		
	 }
	 public String getStudent_MSSV(){
	      return model.getMssv();		
	 }
	 
	 
	// Create funtion get,set from Model HoTen
	 public void setStudent_HoTen(String hoTen)
	 {
		model.setHoTen(hoTen);
	 }
	 public String getStudent_HoTen()
	 {
		 return model.getHoTen();
	 }
	 
	 
	// Create funtion get,set from Model GioiTinh
	 public void setStudent_GioiTinh(String gioiTinh)
	 {
		 model.setGioiTinh(gioiTinh);
	 }
	 public String getStudent_GioiTinh()
	 {
		 return model.getGioiTinh();
	 }
	 
	 
	 // Create funtion get,set from Model Nam Sinh
	 public void setStudent_NamSinh(Integer namSinh)
	 {
		 model.setNamSinh(namSinh);
	 }
	 public Integer getStudent_NamSinh()
	 {
		 return model.getNamSinh();
	 }
	 
	 
	 // Create funtion get,set from Model Email
	 public void setStudent_Email(String email)
	 {
		 model.setEmail(email);
	 }
	 public String getStudent_Email()
	 {
		 return model.getEmail();
	 }
	 
	 
	 // Create funtion get,set from Model LopHoc
	 public void setStudent_LopHoc(String lopHoc)
	 {
		 model.setLopHoc(lopHoc);
	 }
	 public String getStudent_LopHoc()
	 {
		 return model.getLopHoc();
	 }
	 
	 
	 // Create funtion get,set from Model DiaChi
	 public void setStudent_DiaChi(String diaChi)
	 {
		 model.setDiaChi(diaChi);
	 }
	 public String getStudent_DiaChi()
	 {
		 return model.getDiaChi();
	 }
	 
	 
	 // Create funtion get,set from Model DTB
	 public void setStudent_DTB(Double dTB)
	 {
		 model.setdTB(dTB);
	 }
	 public Double getStudent_DTB()
	 {
		 return model.getdTB();
	 }
	 
	 
	 // Update Student Details
	 public void updateView(){				
	      view.printStudentDetails(model.getMssv(), model.getHoTen(), model.getGioiTinh(), 
	    		  model.getNamSinh(), model.getEmail(), model.getLopHoc(),model.getDiaChi(),model.getdTB());
	   }	
}
