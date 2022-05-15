package com.atguigu.threadlocal;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/3 11:27
 **/
public class OrderService {
    public void createOrder(){
        String name = Thread.currentThread().getName();
        System.out.println("OrderService 当前线程["+name+"]中保存的数据是:"+ThreadLocalTest.threadLocal.get());
        new OrderDao().saveOrder();
    }
}
