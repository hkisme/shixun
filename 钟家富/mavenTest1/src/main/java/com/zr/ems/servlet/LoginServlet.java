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
		
		// ����Ո�󅢔�
		String cmd = req.getParameter("cmd");
		
		if("login".equals(cmd)) {
			login(req,resp);
		}else if("zhuce".equals(cmd)) {
			zhuce(req,resp);
		}
	}
	

	private void zhuce(HttpServletRequest req, HttpServletResponse resp) {
		// TODO �Զ����ɵķ������
		String nickname1=req.getParameter("zcusername");
		String password1=req.getParameter("zcpassword");
		String sex=req.getParameter("zcsex");
		double salary=Double.parseDouble(req.getParameter("zcsalary"));
		
		IEmpService service =new EmpService();
		
		 int flag=service.findEmpByNickname(nickname1);
		 
		if(flag==1) {
			req.setAttribute("message10", "���û����ѱ�ע�ᣬ������ע��<br>");
			try {
				req.getRequestDispatcher("/zhuce.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			return;
			
		}else {
			Emp emp =new Emp(1,nickname1,password1,sex,salary);
			service.zhuce(emp);
			req.setAttribute("message11", "ע��ɹ������¼<br>");
			try {
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	
	}



	/**
	 * ����ר�����ڴ����¼���ܵķ���
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */

	private void login(HttpServletRequest req, HttpServletResponse resp) {
		/**
		 * ˼·: 1, ��ȡ���û�������ǳƺ�����<br>
		 * 2, Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û����� 3, �������, �������¼ 4, ���������, ������û�[�˺Ż���������,
		 * �뾭�����¼, �����ǵ��[ע��]]
		 */

		// 1, ��ȡ���û�������ǳƺ�����<br>
		String nickname = req.getParameter("userName");
		String password = req.getParameter("password");

		System.out.println(nickname);
		System.out.println(password);

		// 2, Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û�����
		IEmpService service = new EmpService();

		Emp emp = service.findEmpByNicknameAndPassword(nickname, password);
		
		
        try {
    	   
		if (emp != null) {
			
				resp.sendRedirect("zhuye.jsp");
				
		} else {
			
				req.setAttribute("message", "�˺Ż���������������µ�¼<br>");
				req.getRequestDispatcher("/login.jsp").forward(req, resp);

		   }	
		} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} catch (ServletException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

	}
	


