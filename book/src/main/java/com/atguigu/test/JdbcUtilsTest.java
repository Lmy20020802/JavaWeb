package com.atguigu.test;

import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @ClassName JdbcUtilsTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/30 15:14
 **/
public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
        for (int i = 0; i < 100; i++){
            Connection connection = JdbcUtils.getConnection(); System.out.println(connection); JdbcUtils.close(connection);
        } }
}
