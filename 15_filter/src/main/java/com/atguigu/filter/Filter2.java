package com.atguigu.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName Filter
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/3 08:47
 **/
public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter2前置代码");
        System.out.println("Filter2线程"+Thread.currentThread().getName());
        System.out.println("Filter2:"+request.getParameter("username"));
        System.out.println("Filter2取Filter1中保存的数据是:"+request.getAttribute("key1"));
        chain.doFilter(request,response);
        System.out.println("Filter2线程"+Thread.currentThread().getName());
        System.out.println("Filter2后置代码");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
