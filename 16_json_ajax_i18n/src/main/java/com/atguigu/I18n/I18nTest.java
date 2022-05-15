package com.atguigu.I18n;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName I18nTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/3 20:53
 **/
public class I18nTest {
    @Test
    public void testLocale(){
//        Locale locale=Locale.getDefault();
//        System.out.println(locale);

//        for (Locale availableLocale:Locale.getAvailableLocales())
//        {
//            System.out.println(availableLocale);
//        }

        //获取中文,中文的常量Locale对象
        System.out.println(Locale.CHINA);
        //获取英文,英文的常量Locale对象
        System.out.println(Locale.US);
    }

    @Test
    public void testI18n(){
        //得到我们需要的Locale对象
        Locale us = Locale.CHINA;
        //通过指定的basename和locale对象 读取相对应的配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", us);

        System.out.println("username:"+bundle.getString("username"));
        System.out.println("password:"+bundle.getString("password"));
        System.out.println("sex:"+bundle.getString("sex"));
        System.out.println("age:"+bundle.getString("age"));
    }
}
