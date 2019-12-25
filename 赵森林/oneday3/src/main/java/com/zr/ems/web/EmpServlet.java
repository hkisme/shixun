package com.zr.ems.web;

import com.zr.ems.pojo.Emp;
import com.zr.ems.service.IEmpService;
import com.zr.ems.service.impl.EmpService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        System.out.println(req.getMethod());

        String cmd = req.getParameter("cmd");
        System.out.println(cmd);

        if ("login".equals(cmd)) {
            login(req, resp);
        } else if ("register".equals(cmd)) {
            register(req, resp);
        }
    }

    /**
     * 用于处理登录功能的方法
     *
     * @param req
     * @param resp
     * @throws IOException
     */
    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        /**
         * 思路: 1, 获取到用户输入的昵称和密码<br>
         * 2, 然后去数据库中查找是否正好有对应昵称和密码的用户存在 3, 如果存在, 则允许登录 4, 如果不存在, 则告诉用户[账号或密码有误,
         * 请经检查后登录, 或者是点击[注册]]
         */

        // 1, 获取到用户输入的昵称和密码<br>
        String nickname = req.getParameter("nickname");
        String password = req.getParameter("password");

        System.out.println(nickname);
        System.out.println(password);

        // 2, 然后去数据库中查找是否正好有对应昵称和密码的用户存在
        IEmpService service = new EmpService();

        Emp emp = service.findEmpByNicknameAndPassword(nickname, password);

        if (emp != null) {
            resp.getWriter().write("登录成功, 欢迎: " + emp);

            return;
        } else {
            resp.getWriter().write("账号或密码有误, 请检查后登录");
        }

    }

    /**
     * 用于处理注册
     * @param req
     * @param resp
     * @throws IOException
     */
    private void register(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        try {
            String nickname = req.getParameter("nickname");
            String password = req.getParameter("password");

            System.out.print(nickname);
            System.out.print(password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        resp.getWriter().write("注册成功");
    }
}
