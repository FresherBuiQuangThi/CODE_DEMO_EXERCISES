package IO.Library;
import java.util.Scanner;

public class HinhChuNhatMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat a = new HinhChuNhat(1, 1);
        double dai, rong;
        String color;
        Scanner in= new Scanner(System.in);
        
        System.out.print("Nhap chieu dai: "); dai = Double.parseDouble(in.nextLine()); a.setDai(dai);
        System.out.print("Nhap chieu rong: ");rong=Double.parseDouble(in.nextLine());  a.setRong(rong);
        System.out.print("Nhap mau sac: "); color=in.nextLine();  a.setColor(color);
        
        System.out.println("==========================================");
        System.out.println("Các thông số của HCN là: ");
        System.out.println("Chiều dài: "+a.getDai());
        System.out.println("Chiều rộng: "+a.getRong());
        System.out.println("Màu Sắc: "+a.getColor());
        System.out.println("Diện tích HCN là: "+a.findarea());
        System.out.println("Chu Vi HCN là: "+a.primeter());

	}

}
