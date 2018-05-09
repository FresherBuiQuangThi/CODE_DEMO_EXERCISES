package dao;

import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import model.MyConnectDB;

public class TaiKhoanDAO implements ObjectTaiKhoanDao {

	@Override
	public boolean login(String user, String pass) {
		MyConnectDB db = new MyConnectDB();

		try {
			 ResultSet rss = db.chonDuLieuTuDTB("select * from quanlysinhvien.taikhoan where user='"+user+"' and password='"+pass+"'");
			 
			 if(rss.next() == true) {
				 return true;
			 }
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}	
} 