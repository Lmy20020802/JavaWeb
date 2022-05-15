package com.atguigu.test;

import com.atguigu.dao.OrderItemDao;
import com.atguigu.dao.impl.OrderItemDaoImpl;
import com.atguigu.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @ClassName OrderItemDaoTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/2 17:09
 **/
public class OrderItemDaoTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao=new OrderItemDaoImpl();
        orderItemDao.saveOrderItem(new OrderItem(null,"java从入门到精通",1,new BigDecimal(100),new BigDecimal(100),"1234567890"));
        orderItemDao.saveOrderItem(new OrderItem(null,"javaScript从入门到精通",2,new BigDecimal(100),new BigDecimal(300),"1234567890"));
        orderItemDao.saveOrderItem(new OrderItem(null,"Netty入门",1,new BigDecimal(100),new BigDecimal(100),"1234567890"));
    }
}