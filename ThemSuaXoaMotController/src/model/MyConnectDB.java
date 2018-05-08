package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnectDB {
	String sql;
	String tk;
	String mk;

	public MyConnectDB() {
		super();
		//this.sql = "jdbc:sqlserver://localhost;databaseName=QuanLySinhVien;user=sa;password=123456"; 
		this.sql = "jdbc:mysql://localhost:3306/quanlysinhvien";
		this.tk ="root";
		this.mk ="Thibui123";
	}
	
	public Connection connect() throws Exception{
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Class.forName("com.mysql.jdbc.Driver");
			//Connection  connect = DriverManager.getConnection(this.sql);
			Connection connect = DriverManager.getConnection(sql, tk, mk);
			return connect;
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public void thucThiCauLenhSQL(String sql) throws Exception{
		Connection connect =connect();
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet chonDuLieuTuDTB(String sql) throws Exception{
		Connection connect = connect();
		Statement stmt = connect.createStatement();
		ResultSet rs =stmt.executeQuery(sql);
		return rs;
	}
	public static void main(String[] args) throws Exception {
		MyConnectDB connect = new MyConnectDB();
		System.out.println(connect.connect());
	}
}
