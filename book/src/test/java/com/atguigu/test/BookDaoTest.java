package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @ClassName BookDaoTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/31 08:34
 **/
public class BookDaoTest {
    private BookDao bookDao=new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null,"铭哥怎么这么帅","191125",new BigDecimal(9999),110000,0,null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(21,"铭哥好帅","铭哥",new BigDecimal(9999),110000,0,null));
    }

    @Test
    public void queryForPageTotalCount(){
        System.out.println(bookDao.queryForPageTotalCount());
    }
    @Test
    public void queryForPageTotalCountByPrice(){
        System.out.println(bookDao.queryForPageTotalCountByPrice(10,50));
    }
    @Test
    public void  queryForPageItems(){
        for(Book book:bookDao.queryForPageItems(8, Page.page_size))
        {
            System.out.println(book);
        }
    }

    @Test
    public void  queryForPageItemsByPrice(){
        for(Book book:bookDao.queryForPageItemsByPrice(0, Page.page_size,10,50))
        {
            System.out.println(book);
        }
    }
}