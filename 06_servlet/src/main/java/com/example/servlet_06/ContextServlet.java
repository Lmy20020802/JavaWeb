package com.example.servlet_06; /**
 * @ClassName ${NAME}
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/26 21:40
 **/

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends Hx {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context=getServletConfig().getServletContext();
        String username = context.getInitParameter("username");
        System.out.println("context-param参数username的值是:"+username);
        System.out.println("context-param参数password的值是"+context.getInitParameter("password"));
        System.out.println("当前工程路径"+context.getContextPath());
        System.out.println("工程部署的路径是"+context.getRealPath("/"));
        System.out.println("工程下css目录的绝对路径是:"+context.getRealPath("/css"));
        System.out.println("工程下css目录的绝对路径是:"+context.getRealPath("/Imgs/1.jpg"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
