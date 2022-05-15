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
public class Response2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getAttribute("key1"));
        resp.getWriter().write("response2's result!");
    }
}
