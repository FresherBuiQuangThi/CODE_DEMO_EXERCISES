
public class Student_View {
	// Create funtion view on display
	public void printStudentDetails(String mssv, String hoTen, String gioiTinh, Integer namSinh, String email, String lopHoc, 
			String diaChi, Double DTB){
	      System.out.println("Thông tin của sinh viên là:");
	      System.out.println("===========================================================");
	      System.out.println("MSSV: " + mssv);
	      System.out.println("Họ và tên: " + hoTen);
	      System.out.println("Giới tính: " + gioiTinh);
	      System.out.println("Năm sinh: " + namSinh);
	      System.out.println("Email: " + email);
	      System.out.println("Lớp học: " + lopHoc);
	      System.out.println("Địa chỉ: " + diaChi);
	      System.out.println("Điểm trung bình: " + DTB);
	   }
}
