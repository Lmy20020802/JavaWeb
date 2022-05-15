package com.example.servlet_06; /**
 * @ClassName ${NAME}
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/26 22:31
 **/

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ContextServlet1", value = "/ContextServlet1")
public class ContextServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = getServletContext();
        System.out.println(context);
        System.out.println("保存之前context1中获取之前key1的值是"+context.getAttribute("key1"));
        context.setAttribute("key1","value1");
        System.out.println("context1中获取域数据key1的值是"+context.getAttribute("key1"));

    }

}
