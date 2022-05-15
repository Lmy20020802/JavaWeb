package com.atguigu.threadlocal;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/3 11:32
 **/
public class OrderDao {
    public void saveOrder(){
        String name = Thread.currentThread().getName();
        System.out.println("OrderDao 当前线程["+name+"]中保存的数据是:"+ThreadLocalTest.threadLocal.get());
    }
}
