package com.atguigu.web;

import com.atguigu.pojo.Book;
import com.atguigu.pojo.Cart;
import com.atguigu.pojo.CartItem;
import com.atguigu.service.BookService;
import com.atguigu.service.impl.BookServiceImpl;
import com.atguigu.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName CartServlet
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/2 11:27
 **/
public class CartServlet extends BaseServlet{
    private BookService bookService=new BookServiceImpl();
    /**
     *@description:加入购物车
     *@Author:lmy
     *@Date:2022/4/2 11:28
     *@param req
     */

    protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取请求的参数 商品编号
        int id= WebUtils.parseInt(req.getParameter("id"),0);
        //调用bookService.queryBookyById(id):Book得到}图书的信息
        Book book = bookService.queryBookById(id);
        //把图书信息,转换成为CartItem商品项
        CartItem cartItem=new CartItem(book.getId(),book.getName(),1,book.getPrice(),book.getPrice());
        //调用Cart.addItem(CartItem);添加商品项
        Cart cart=(Cart) req.getSession().getAttribute("cart");
        if (cart==null)
        {
            cart=new Cart();
            req.getSession().setAttribute("cart",cart);
        }
        cart.addItem(cartItem);
        System.out.println(cart);
        System.out.println("请求头Referer的值"+req.getHeader("Referer"));
//        //重定向回原来商品所在的地址页面
//        resp.sendRedirect(req.getHeader("Referer"));
        //最后一个商品添加的名称
        req.getSession().setAttribute("lastName",cartItem.getName());
        //重定向回原来购物车展示页面
        resp.sendRedirect(req.getHeader("Referer"));
    }

    /**
     *@description:删除商品项
     *@Author:lmy
     *@Date:2022/4/2 11:28
     *@param req
     */
    protected void deleteItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取商品编号
        int id=WebUtils.parseInt(req.getParameter("id"),0);

        Cart cart =(Cart)req.getSession().getAttribute("cart");

        if (cart!=null){
            //删除了购物车商品项目
            cart.deleteItem(id);
            //重定向回原来购物车展示页面
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    /**
     *@description:清空购物车
     *@Author:lmy
     *@Date:2022/4/2 11:28
     *@param req
     */
    protected void clear(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取购物车对象
        Cart cart=(Cart)req.getSession().getAttribute("cart");
        if (cart!=null){
            cart.clear();
            //重定向回原来购物车展示页面
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }

    /**
     *@description:修改商品值
     *@Author:lmy
     *@Date:2022/4/2 15:26
     *@param:req
     *@paramresp
     */

    protected void updateCount(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求的参数 商品编号 商品数量
        int id=WebUtils.parseInt(req.getParameter("id"),0);
        int count=WebUtils.parseInt(req.getParameter("count"),1);
        //获取Cart购物车对象
        Cart cart=(Cart)req.getSession().getAttribute("cart");
        if (cart!=null){
            cart.updateCount(id,count);
            //重定向回原来购物车展示页面
            resp.sendRedirect(req.getHeader("Referer"));
        }
    }
}
