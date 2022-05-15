package com.atguigu.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ClassName AdminFilter
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/2 20:13
 **/
public class AdminFilter implements Filter {

    public AdminFilter(){
        System.out.println("1.Filter构造器方法AdminFilter");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("2.Filter的init方法(FilterConfig filterConfig)初始化");
        //1.获取Filter的名称 filter-name的内容
        System.out.println("filter-name的值是:"+filterConfig.getFilterName());
        //2.获取在web.xml中的配置的init-param的初始化参数
        System.out.println("初始化参数username的值是:"+filterConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:"+filterConfig.getInitParameter("url"));
        //3.ServletContext对象
        System.out.println(filterConfig.getServletContext());
    }

    /**
     *@description:doFilter方法,专门用于拦截请求,可以做权限 检查
     *@Author:lmy
     *@Date:2022/4/2 20:17
     *@param:request
     *@param:response
     *@param:chain
     */

    /**
     * doFilter 方法，专门用于拦截请求。可以做权限检查
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("3.Filter的doFilter()过滤方法");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession(); Object user = session.getAttribute("user");
// 如果等于 null，说明还没有登录
        if (user == null) {
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
            return;
        } else {
        // 让程序继续往下访问用户的目标资源
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }


    @Override
    public void destroy() {
        System.out.println("4.Filter的destroy()销毁方法");
    }
}
