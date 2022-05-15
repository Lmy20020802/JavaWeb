package com.example.servlet_07;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @ClassName ParameterServlet
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/27 10:37
 **/
public class ParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        System.out.println("--------doGet---------");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");
        System.out.println("用户名:"+username);
        System.out.println("密码:"+password);
        System.out.println("兴趣爱好:"+ Arrays.asList(hobby));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("--------doPost---------");
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");
        System.out.println("用户名:"+username);
        System.out.println("密码:"+password);
        System.out.println("兴趣爱好:"+ Arrays.asList(hobby));
    }
}
