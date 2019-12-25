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
	//设置请求的编码
	req.setCharacterEncoding("utf-8");
	
	//告诉客户端如何解析服务器发送的响应（反馈）
	resp.setContentType("text/html;charset=utf-8");
	
	//接受请求中的name参数
	String name=req.getParameter("name");
	System.out.println(name);
	
	//服务器向客户端发送响应信息
	resp.getWriter().write("客户端,hello。");
}
}
