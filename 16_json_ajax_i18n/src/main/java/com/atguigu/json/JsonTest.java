package com.atguigu.json;

import com.atguigu.pojo.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JsonTest
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/3 16:01
 **/
public class JsonTest {
    //1.2.1 javaBean和json的互转
    @Test
    public void test1(){
        Person p1=new Person(1,"铭哥好帅!");
        //创建Gson对象实例
        Gson gson=new Gson();

        //toJson方法可以吧java对象转换成为json字符串
        String personJsonString = gson.toJson(p1);
        System.out.println(personJsonString);

        //fromJson把json字符串转换为java对象
        //第一个参数是json字符串
        //第二个参数式转换回去的java对象类型
        Person p2 = gson.fromJson(personJsonString, Person.class);
        System.out.println(p2);
    }

    //1.2.2 list和json的互转
    @Test
    public void test2(){
        List<Person> personList=new ArrayList<>();

        personList.add(new Person(1,"李铭洋"));
        personList.add(new Person(2,"王婷婷"));

        Gson gson=new Gson();
        //把list转换为json字符串
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);

//        List<Person> list = gson.fromJson(personListJsonString,new PersonListType().getType());
        List<Person> list = gson.fromJson(personListJsonString,new TypeToken<ArrayList<Person>>(){}.getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);
    }

    //1.2.3 map和json的互转
    @Test
    public void test3(){
        Map<Integer,Person> personMap=new HashMap<Integer,Person>();

        personMap.put(1,new Person(1,"李铭洋"));
        personMap.put(2,new Person(2,"王婷婷"));

        Gson gson=new Gson();
        //把map集合转换成为json字符串
        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

//        Map<Integer,Person> personMap2=gson.fromJson(personMapJsonString,new PersonMapType().getType());
        Map<Integer,Person> personMap2=gson.fromJson(personMapJsonString,new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(personMap2);
        Person p = personMap2.get(1);
        System.out.println(p);
    }
}
