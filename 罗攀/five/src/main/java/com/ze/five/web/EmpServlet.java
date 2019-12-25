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
    		System.out.println("�յ������¼");
    		login(req,resp);
    	}
    	else if("register".equals(cmd)) {
    		register(req,resp);
    	}
    }
     
     
     
      private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//���ǰ̨���ݵ�����
    	String nickname =req.getParameter("nickname");
  		String password= req.getParameter("password");
  		String gender =req.getParameter("gender");
		double salary= Double.parseDouble(req.getParameter("salary"));
		
		//�жϷ����Ƿ�ʹ��
		
		IEmpService service=new EmpService();
		//�ж��û����Ƿ����
		int flag= service.findEmpByNickname(nickname);
		if (flag==1) {
			req.setAttribute("nicknameMsg","���û��Ѵ��ڣ��뻻һ��");
			req.getRequestDispatcher("/register.jsp").forward(req,resp);
		}else {
			// �����е����ݷ�װ��ʵ�������
			Emp emp = new Emp(1, nickname, password, gender, salary);

			// ����ע��ķ���
			service.registerEmp(emp);

			resp.getWriter().write("ע��ɹ�, 3s����ת����¼ҳ��");

			resp.setHeader("refresh", "3;url=/ems/login.jsp");
		}
		
		//�����еĶ����װ��ʵ�����
		
		Emp emp=new Emp(1, nickname, password, gender, salary);
		
	}
	/**
      * ר�Ŵ����¼���ܵķ���
     * @throws IOException 
      */
      
      
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		/**
		 * ˼·��1����ȡ���û�������ǳƺ�����<br>
		 * 2��Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û�����
		 * 3��������ڣ��������¼
		 * 4����������ڣ�������û����˺Ż���������������¼�������ǵ����ע�᡿��
		 */
		//1��ȡ���û�������ǳƺ�����<br>
		String nickname =req.getParameter("nickname");
		String password= req.getParameter("password");
		
		System.out.println(nickname);
		System.out.println(password);
		//2��Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û�����
		IEmpService service=new EmpService();
		Emp emp = service.findEmpByNicknameAndPassword(nickname, password);

		if (emp != null) {
			resp.getWriter().write("��¼�ɹ�, ��ӭ: " + emp);

			return;
		} else {
			resp.getWriter().write("�˺Ż���������, ������¼");
		}
	}
     
     
     
}
