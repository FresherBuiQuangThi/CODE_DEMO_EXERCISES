package dao;

import model.MyConnectDB;
import model.ThanhVien;

public class ThanhVienDAO implements ObjectDAO{

	@Override
	public boolean add(Object obj) {
		ThanhVien tv = (ThanhVien) obj;
		try {
			//new MyConnectDB().thucThiCauLenhSQL("insert into ThanhVien values('"+tv.getId()+"','"+tv.getHo()+"','"+tv.getTen()+"','"+tv.getTaKhoan()+"')");
			new MyConnectDB().thucThiCauLenhSQL("insert into quanlysinhvien.thanhvien values('"+tv.getId()+"','"+tv.getHo()+"','"+tv.getTen()+"','"+tv.getTaKhoan()+"')");
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean edit(Object obj, String id) {
		ThanhVien tv = (ThanhVien) obj;
		try {
			//new MyConnectDB().thucThiCauLenhSQL("update ThanhVien set Ho='"+tv.getHo()+"',Ten='"+tv.getTen()+"',TaiKhoan='"+tv.getTaKhoan()+"' where id='"+id+"'");
			new MyConnectDB().thucThiCauLenhSQL("update quanlysinhvien.thanhvien set Ho='"+tv.getHo()+"',Ten='"+tv.getTen()+"',TaiKhoan='"+tv.getTaKhoan()+"' where id='"+id+"'");
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean del(String id) {
		try {
			//new MyConnectDB().thucThiCauLenhSQL("delete from ThanhVien where id='"+id+"'");
			new MyConnectDB().thucThiCauLenhSQL("delete from quanlysinhvien.thanhvien where id='"+id+"'");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
}
