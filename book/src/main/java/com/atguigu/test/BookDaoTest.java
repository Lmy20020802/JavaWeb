package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;

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
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook: bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }
}