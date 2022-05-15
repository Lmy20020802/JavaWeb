package com.atguigu.dao;

import com.atguigu.pojo.Order;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/2 16:51
 **/
public interface OrderDao {
    public int saveOrder(Order order);
}
