package com.atguigu.web;

import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;
import com.atguigu.service.BookService;
import com.atguigu.service.impl.BookServiceImpl;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName BookServlet
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/31 08:55
 **/
public class BookServlet extends BaseServlet{
    private BookService bookService=new BookServiceImpl();

    //处理分页功能
    protected void page(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求的参数pageNo和pageSize
        int pageNo=WebUtils.parseInt(req.getParameter("pageNo"),1);
        int pageSize=WebUtils.parseInt(req.getParameter("pageSize"), Page.page_size);
        //2.调用BookService.page(pageNo,pageSize): Page对象
        Page<Book> page=bookService.page(pageNo,pageSize);
        page.setUrl("manager/bookServlet?action=page");
        //3.保存Page对象到Request域中
        req.setAttribute("page",page);
        //4.请求转发到pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req,resp);
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageNo=WebUtils.parseInt(req.getParameter("pageNo"),0);
        pageNo+=1;
        //        1、获取请求的参数==封装成为Book对象
        Book book = WebUtils.copyParamToBean(req.getParameterMap(),new Book());
//        2、调用BookService.addBook()保存图书
        bookService.addBook(book);
//        3、跳到图书列表页面
//      manager/bookServlet?action=list
//        req.getRequestDispatcher("/manager/bookServlet?action=list").forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/manager/bookServlet?action=page&pageNo="+pageNo);
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1、获取请求的参数 id，图书编程
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
//        2、调用 bookService.deleteBookById();删除图书
        bookService.deleteBookById(id);
//        3、重定向回图书列表管理页面 /book/manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page&pageNo="+req.getParameter("pageNo"));
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求的参数=封装成为Book对象
        Book book=WebUtils.copyParamToBean(req.getParameterMap(),new Book());
        //2.调用BookService.updateBook(book);修改图书馆
        bookService.updateBook(book);
        //3.重定向回图书列表管理页面
        //地址:/工程名/manager/bookServlet?action=list
        resp.sendRedirect(req.getContextPath()+"/manager/bookServlet?action=page&pageNo="+req.getParameter("pageNo"));
    }

    protected void getBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求的参数图书编号
        int id=WebUtils.parseInt(req.getParameter("id"),0);
        //2.调用bookService.queryBookById查询图书
        Book book = bookService.queryBookById(id);
        //3.保存到图书到Requst域中
        req.setAttribute("book",book);
        //4.请求转发到 pages/manager/book_edit.jsp页面
        req.getRequestDispatcher("/pages/manager/book_edit.jsp").forward(req,resp);
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 通过 BookService 查询全部图书
        List<Book> books = bookService.queryBooks();
        //2 把全部图书保存到 Request 域中
        req.setAttribute("books", books);
        //3、请求转发到/pages/manager/book_manager.jsp 页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req,resp);
    }
}
