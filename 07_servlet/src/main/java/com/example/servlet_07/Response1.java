package com.example.servlet_07;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName Response1
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/27 17:33
 **/
public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游Response1");
        req.setAttribute("key1","value1");
        //设置响应状态码302,表示重定向(已搬迁)
        //方法一
//        resp.setStatus(302);
        //设置响应头,说明新的地址在哪里
//        resp.setHeader("Location","http://localhost:8080/07_servlet/response2");
//        resp.setHeader("Location","http://localhost:8080/07_servlet/WEB-INF/form.html");
//        resp.setHeader("Location","http://www.baidu.com");

        //方法二
        resp.sendRedirect("http://localhost:8080");
    }
}
