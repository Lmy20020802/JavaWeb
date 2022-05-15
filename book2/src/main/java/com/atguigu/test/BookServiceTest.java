package com.atguigu.test;

import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import com.atguigu.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @ClassName BookServiceTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/31 08:45
 **/
public class BookServiceTest {
    private BookService bookService=new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book(null,"铭哥在手，天下我有!", "1125", new BigDecimal(1000000), 100000000, 0, null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(22);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(22,"社会我铭哥,人狠话不多!", "1125", new BigDecimal(999999), 10, 0, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }

    @Test
    public void queryBooks() {
        for (Book querybook:bookService.queryBooks()) {
            System.out.println(querybook);
        }
    }
}