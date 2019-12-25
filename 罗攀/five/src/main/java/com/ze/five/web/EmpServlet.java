package com.ze.five.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.http2.Flags;

import com.ze.five.service.imple.EmpService;
import com.zr.five.pojo.Emp;
import com.ze.five.service.IEmpService;

@SuppressWarnings("serial")
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet{
     @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	
    	String cmd=req.getParameter("cmd");
    	
    	if("login".equals(cmd)) {
    		System.out.println("收到命令，登录");
    		login(req,resp);
    	}
    	else if("register".equals(cmd)) {
    		register(req,resp);
    	}
    }
     
     
     
      private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获得前台传递的数据
    	String nickname =req.getParameter("nickname");
  		String password= req.getParameter("password");
  		String gender =req.getParameter("gender");
		double salary= Double.parseDouble(req.getParameter("salary"));
		
		//判断服务是否被使用
		
		IEmpService service=new EmpService();
		//判断用户名是否存在
		int flag= service.findEmpByNickname(nickname);
		if (flag==1) {
			req.setAttribute("nicknameMsg","该用户已存在，请换一个");
			req.getRequestDispatcher("/register.jsp").forward(req,resp);
		}else {
			// 把所有的数据封装到实体对象中
			Emp emp = new Emp(1, nickname, password, gender, salary);

			// 调用注册的方法
			service.registerEmp(emp);

			resp.getWriter().write("注册成功, 3s后跳转到登录页面");

			resp.setHeader("refresh", "3;url=/ems/login.jsp");
		}
		
		//把所有的对象封装到实体对象
		
		Emp emp=new Emp(1, nickname, password, gender, salary);
		
	}
	/**
      * 专门处理登录功能的方法
     * @throws IOException 
      */
      
      
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		/**
		 * 思路：1：获取到用户输入的昵称和密码<br>
		 * 2、然后去数据库中查找是否正好有对应昵称和密码的用户存在
		 * 3、如果存在，则允许登录
		 * 4、如果不存在，则告诉用户【账号或密码有误，请检查后登录，或者是点击【注册】】
		 */
		//1获取到用户输入的昵称和密码<br>
		String nickname =req.getParameter("nickname");
		String password= req.getParameter("password");
		
		System.out.println(nickname);
		System.out.println(password);
		//2、然后去数据库中查找是否正好有对应昵称和密码的用户存在
		IEmpService service=new EmpService();
		Emp emp = service.findEmpByNicknameAndPassword(nickname, password);

		if (emp != null) {
			resp.getWriter().write("登录成功, 欢迎: " + emp);

			return;
		} else {
			resp.getWriter().write("账号或密码有误, 请检查后登录");
		}
	}
     
     
     
}
