package mavenTest1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/helloservlet")
public class Helloservlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//��������ı���
	req.setCharacterEncoding("utf-8");
	
	//���߿ͻ�����ν������������͵���Ӧ��������
	resp.setContentType("text/html;charset=utf-8");
	
	//���������е�name����
	String name=req.getParameter("name");
	System.out.println(name);
	
	//��������ͻ��˷�����Ӧ��Ϣ
	resp.getWriter().write("�ͻ���,hello��");
}
}
