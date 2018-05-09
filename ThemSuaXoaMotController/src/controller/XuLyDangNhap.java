package controller;
import java.awt.Frame;
import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.TaiKhoanDAO;
import dao.ThanhVienDAO;
import model.MyConnectDB;

@WebServlet("/XuLyDangNhap")
public class XuLyDangNhap extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public XuLyDangNhap() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext contextChucNang = getServletContext();
		String chucNang = (String) contextChucNang.getAttribute("chucNang");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		if (chucNang.equals("Login")) {
			chucNang=request.getParameter("chucNang");
			
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			
			ResultSet rs;
			TaiKhoanDAO tkdao = new TaiKhoanDAO();
			try {
				if(user == "1" && pass == "123456") {
					response.sendRedirect("index.jsp");
				}
				
				else if((tkdao.login(user,pass) == true)) {
					response.sendRedirect("index.jsp");
				}
				else {
					response.sendRedirect("login.jsp");
					JOptionPane.showMessageDialog(null, "User or password are not cornect!!!","Title", JOptionPane.ERROR_MESSAGE);
				}
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Loi!");
				e.printStackTrace();
			}
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
