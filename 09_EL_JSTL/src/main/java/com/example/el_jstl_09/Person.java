package com.example.el_jstl_09;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @ClassName Person
 * @Description TODO
 * @Author lmy
 * @Date 2022/3/29 14:18
 **/
public class Person{
    private String name;
    private String[] phones;
    private List<String> cites;
    private Map<String,Object> map;
    private int age=18;

    public Person() {

    }

    public Person(String name, String[] phones, List<String> cites, Map<String, Object> map) {
        this.name = name;
        this.phones = phones;
        this.cites = cites;
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCites() {
        return cites;
    }

    public void setCites(List<String> cites) {
        this.cites = cites;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "name=" + name +
                ", phones=" + Arrays.toString(phones) +
                ", cites=" + cites +
                ", map=" + map +
                '}';
    }
}
