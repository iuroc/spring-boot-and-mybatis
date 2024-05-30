package com.iuroc.demo.model;

public class User {
    public int id;
    public String name;
    public int age;
    public String create;

    /** 用于 <strong>update</strong> 操作 */
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /** 用于 <strong>insert</strong> 操作 */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
