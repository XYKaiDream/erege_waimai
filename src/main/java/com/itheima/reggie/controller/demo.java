package com.itheima.reggie.controller;

import java.util.*;

/**
 * @author XYK
 * @version 1.0
 */
public class demo {
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<Dog>();
        Dog dog = new Dog("asd",1,123);
        Dog dog1 = new Dog("bvsadsd",1,123);
        Dog dog2 = new Dog("gtre",1,123);
        list.add(dog);
        list.add(dog1);
        list.add(dog2);
        Iterator<Dog> it = list.iterator();
        while (it.hasNext()){
            Dog d = it.next();
            System.out.println(d.getName()+"--"+d.getAge()+"--"+d.getPhone());
        }

        List<Map<String,Object>> list1 = new ArrayList();
        Map<String,Dog> map = new HashMap<>();
        map.put("1",dog);
        map.put("2",dog1);
        map.put("3",dog2);
        Dog dog4 = map.get("1");
        System.out.println(dog4.getName());





    }
}
class Dog{
    private String name;
    private int age;
    private int phone;

    public Dog(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
