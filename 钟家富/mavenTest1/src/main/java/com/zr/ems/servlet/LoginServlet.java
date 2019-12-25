package com.zr.ems.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zr.ems.pojo.Emp;
import com.zr.ems.service.IEmpService;
import com.zr.ems.service.impl.EmpService;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		// 接收請求參數
		String cmd = req.getParameter("cmd");
		
		if("login".equals(cmd)) {
			login(req,resp);
		}else if("zhuce".equals(cmd)) {
			zhuce(req,resp);
		}
	}
	

	private void zhuce(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 自动生成的方法存根
		String nickname1=req.getParameter("zcusername");
		String password1=req.getParameter("zcpassword");
		String sex=req.getParameter("zcsex");
		double salary=Double.parseDouble(req.getParameter("zcsalary"));
		
		IEmpService service =new EmpService();
		
		 int flag=service.findEmpByNickname(nickname1);
		 
		if(flag==1) {
			req.setAttribute("message10", "该用户名已被注册，请重新注册<br>");
			try {
				req.getRequestDispatcher("/zhuce.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			return;
			
		}else {
			Emp emp =new Emp(1,nickname1,password1,sex,salary);
			service.zhuce(emp);
			req.setAttribute("message11", "注册成功，请登录<br>");
			try {
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	
	}



	/**
	 * 这是专门用于处理登录功能的方法
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */

	private void login(HttpServletRequest req, HttpServletResponse resp) {
		/**
		 * 思路: 1, 获取到用户输入的昵称和密码<br>
		 * 2, 然后去数据库中查找是否正好有对应昵称和密码的用户存在 3, 如果存在, 则允许登录 4, 如果不存在, 则告诉用户[账号或密码有误,
		 * 请经检查后登录, 或者是点击[注册]]
		 */

		// 1, 获取到用户输入的昵称和密码<br>
		String nickname = req.getParameter("userName");
		String password = req.getParameter("password");

		System.out.println(nickname);
		System.out.println(password);

		// 2, 然后去数据库中查找是否正好有对应昵称和密码的用户存在
		IEmpService service = new EmpService();

		Emp emp = service.findEmpByNicknameAndPassword(nickname, password);
		
		
        try {
    	   
		if (emp != null) {
			
				resp.sendRedirect("zhuye.jsp");
				
		} else {
			
				req.setAttribute("message", "账号或者密码错误，请重新登录<br>");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);

		   }	
		} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (ServletException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

	}
	


