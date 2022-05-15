package com.atguigu.dao;

import com.atguigu.pojo.OrderItem;

/**
 * @ClassName OrderItemDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/2 16:52
 **/
public interface OrderItemDao {
    public int saveOrderItem(OrderItem orderItem);
}
