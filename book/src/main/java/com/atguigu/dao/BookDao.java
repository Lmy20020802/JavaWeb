package com.atguigu.dao;

import com.atguigu.pojo.Book;

import java.util.List;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/31 08:20
 **/
public interface BookDao {
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

    List<Book> queryForPageItems(int begin, int pageSize);

    Integer queryForPageTotalCount();

    Integer queryForPageTotalCountByPrice(int min, int max);

    List<Book> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);
}
