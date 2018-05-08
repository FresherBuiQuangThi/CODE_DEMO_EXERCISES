package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ThanhVienDAO;
import model.MyConnectDB;
import model.ThanhVien;

@WebServlet("/XuLyThemSuaXoaController")
public class XuLyThemSuaXoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public XuLyThemSuaXoaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext contextChucNang = getServletContext();
		String chucNang = (String) contextChucNang.getAttribute("chucNang");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		if (chucNang == null || chucNang.equals("")) {
			chucNang=request.getParameter("chucNang");
			String id = request.getParameter("id");
			new ThanhVienDAO().del(id);
			response.sendRedirect("index.jsp");
		} else if (chucNang.equals("Sua")) {
			ServletContext contextID = getServletContext();
			String id = (String) contextID.getAttribute("id");
			String ho = request.getParameter("ho");
			String ten = request.getParameter("ten");
			String taiKhoan = request.getParameter("tk");
			ThanhVien tv = new ThanhVien(id, ho, ten, taiKhoan);
			new ThanhVienDAO().edit(tv, id);
			response.sendRedirect("index.jsp");
		} else if (chucNang.equals("Them")) {
			try {
				String count = "";
				ResultSet rs;
				//rs = new MyConnectDB().chonDuLieuTuDTB("select * from ThanhVien");
				rs = new MyConnectDB().chonDuLieuTuDTB("select * from quanlysinhvien.thanhvien");
				while (rs.next()) {
					String stt = rs.getString(1);
					count = Integer.parseInt(stt) + 1 + "";
				}
				String ho = request.getParameter("ho");
				String ten = request.getParameter("ten");
				String taiKhoan = request.getParameter("tk");
				ThanhVien tv = new ThanhVien(count, ho, ten, taiKhoan);
				new ThanhVienDAO().add(tv);
				response.sendRedirect("index.jsp");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("abcd");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
