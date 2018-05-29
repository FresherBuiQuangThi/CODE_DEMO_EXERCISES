package com.buiquangthi.demo01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudMySQL {

	// Ten cua driver va dia chi URL cua co so du lieu
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";

	// Ten nguoi dung va mat khau cua co so du lieu
	static final String USER = "root";
	static final String PASS = "Thibui123";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// Buoc 2: Dang ky Driver
			Class.forName("com.mysql.jdbc.Driver");

			// Buoc 3: Mo mot ket noi
			System.out.println("Dang ket noi toi co so du lieu ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Chuoi ket noi la:   " + conn.toString());
			
			// Buoc 4: Thiet lap auto commit la false.
			conn.setAutoCommit(false);

			// Buoc 5: Thuc thi truy van
			System.out.println("Tao cac lenh truy van SQL ...");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// Buoc 6: Chen mot hang vao trong bang sinhvienk60
			System.out.println("\nChen mot hang ...");
			String SQL = "INSERT INTO test.sinhvienk60" + " " + "VALUES (10, 'Bui Quang', 'Thi', 7.5)";
			System.out.println("\nCau lenh la:   " + SQL);
			stmt.executeUpdate(SQL);
			System.out.println("\nInsert thanh cong:   " + SQL);
			System.out.print("\n=====================================================");

			// Buoc 7: Chen mot hang vao trong bang sinhvienk60
			System.out.println("\nChen mot hang ...");
			SQL = "INSERT INTO test.sinhvienk60" + " " + "VALUES (9, 'Bui Quang', 'Thi', 7.5)";
			System.out.println("\nCau lenh la:   " + SQL);
			stmt.executeUpdate(SQL);
			System.out.println("\nInsert thanh cong:   " + SQL);
			System.out.print("\n=====================================================");

			
			// Buoc 8: Ky thac cac thay doi.
			System.out.println("\nKy thac cac thay doi ...");
			conn.commit();

			// Buoc 9: Liet ke tat ca cac ban ghi.
			String sql = "SELECT * FROM test.sinhvienk60";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("\nLiet ke result set de tham chieu ...");
			printRs(rs);

			// Buoc 10: Don sach moi truong va giai phong resource
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException se) {
			// Xu ly cac loi cho JDBC
			System.out.println("\nLoi xay ra trong chuong trinh: ");
			se.printStackTrace();
			// Neu xuat hien loi thi xoa sach cac thay doi va tro ve trang thai truoc khi co thay doi.
			System.out.println("\nROLLBACK ve trang thai truoc khi thay doi. Dang kiem tra chuoi ket noi .........");
			try {
				if (conn != null) {
					System.out.println("\nChuoi ket noi khong rong. Bat dau tien hanh ROLLBACK......");
					conn.rollback();
					System.out.println("\nRollback thanh cong!");
				}
					
			} catch (SQLException se2) {
				se2.printStackTrace();
				System.out.println("\nRollback that bai!");
			} // Ket thuc khoi try

		} catch (Exception e) {
			// Xu ly cac loi cho Class.forName
			e.printStackTrace();
			System.out.println("\nClass.forName khong ton tai! Vui long kiem tra lai! Ket noi that bai!");
		} finally {
			// Khoi finally duoc su dung de dong cac resource
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // Ket thuc khoi finally
		} // Ket thuc khoi try
	}// Ket thuc main

	public static void printRs(ResultSet rs) throws SQLException {
		// Bao dam chung ta da bat dau tu hang dau tien
		rs.beforeFirst();
		while (rs.next()) {
			// Lay du lieu boi su dung ten cot
			int mssv = rs.getInt("id");
			String ho = rs.getString("ho");
			String ten = rs.getString("ten");
			double diemthi = rs.getDouble("diemthi");

			// Hien thi cac gia tri
			System.out.print("\nid: " + mssv);
			System.out.print("\nHo: " + ho);
			System.out.println("\nTen: " + ten);
			System.out.print("\nDiem Thi: " + diemthi);
			System.out.print("\n=================");
		}
		System.out.println();
	}// Ket thuc printRs()
}// Ket thuc ViDuJDBC
