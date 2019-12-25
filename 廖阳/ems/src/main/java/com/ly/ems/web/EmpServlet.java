package com.ly.ems.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ly.ems.Dao.IEmpDao;
import com.ly.ems.Dao.impl.EmpDao;
import com.ly.ems.pojo.Emp;
import com.ly.ems.service.impl.IEmpService;
import com.ly.ems.service.EmpService;;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		String cmd = req.getParameter("cmd");

		if ("login".equals(cmd)) {
			login(req, resp);
		} else if ("register".equals(cmd)) {
			register(req, resp);
		}
	}

	/**
	 * 注册信息
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password1");
		String gender = req.getParameter("gender");
		double salary = Double.parseDouble(req.getParameter("salary"));
		
		EmpService service = new IEmpService();
		int flag=service.findEmpByUserName(username);
		if(flag==1){
			req.setAttribute("username", "名称已存在，请更换!");
			req.getRequestDispatcher("ZhuCe.jsp").forward(req, resp);
			return;
		}else{
			Emp emp = new Emp(1, username, password, gender, salary);
			service.addEmpByAll(emp);
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
		
	}

	/**
	 * 登录的判断的函数
	 * 
	 * @throws IOException
	 * @throws ServletException
	 */
	private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		EmpService service = new IEmpService();
		// IEmpDao iEmpDao=new EmpDao();
		Emp emp = service.findEmpByNicknameAndPassword(username, password);
		if (emp != null) {
			// req.getRequestDispatcher("Succeed.jsp").forward(req, resp);
			resp.sendRedirect("Succeed.jsp");
			System.out.println("asdasd");
		} else {
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}
