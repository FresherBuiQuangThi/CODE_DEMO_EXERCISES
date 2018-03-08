package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnectDB {
	
	private static String DB_URL = null;
    private static String USER_NAME = "sa";
    private static String PASSWORD = "Thibui123";
    Connection conn = null;
	
	
	public MyConnectDB() {
		super();
		DB_URL =  "jdbc:sqlserver://localhost:1433;user=sa;password=Thibui123;database=testdb;";
		}
	
	public static  Connection connect() throws Exception{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(DB_URL);
            System.out.println("Connect successfully!");
            System.out.println(conn.toString());
            return conn;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	public  void thucThiSQL(String sql) throws Exception{
		Connection connect = connect();
		Statement stmt = connect.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet chonDuLieu(String sql) throws Exception{
		Connection connect =connect();
		Statement stmt = connect.createStatement();
		ResultSet rs=	stmt.executeQuery(sql);
		return rs;
	}
		
	
	public PreparedStatement dungStament(String sql) throws SQLException, Exception{
		return connect().prepareStatement(sql);
	}

	
	public static void main(String[] args) throws Exception {
		System.out.println(new MyConnectDB().connect());
		
//		try {
//            // connnect to database 'testdb'
//            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//            // crate statement
//            Statement stmt = conn.createStatement();
//            // get data from table 'student'
//            ResultSet rs = stmt.executeQuery("select * from DangNhap");
//            // show data
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + "  " + rs.getString(2) 
//                        + "  " + rs.getString(3));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }	
	}
	
//	public static Connection getConnection(String dbURL, String userName, 
//            String password) {
//        Connection conn = null;
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            conn = DriverManager.getConnection(dbURL, userName, password);
//            System.out.println("connect successfully!");
//        } catch (Exception ex) {
//            System.out.println("connect failure!");
//            ex.printStackTrace();
//        }
//        return conn;
//    }

}
