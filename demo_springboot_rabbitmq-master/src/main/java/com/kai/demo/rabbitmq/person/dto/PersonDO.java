package com.kai.demo.rabbitmq.person.dto;

/**
 * <p>Project: rabbitmq </p>
 * <p>Description: </p>
 * <p>Copyright (c) 2023 Karrytech (Shanghai/Beijing) Co., Ltd.</p>
 * <p>All Rights Reserved.</p>
 *
 * @author <a href="mailto:zhangkai@karrytech.com">Zhang Kai</a>
 */
public class PersonDO {
    private String id;
    private String userId;
    private String name;
    private int age;

    public PersonDO(String id, String userId, String name, int age) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.age = age;
    }

    public PersonDO() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}