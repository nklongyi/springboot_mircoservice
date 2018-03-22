package com.nklongyi.srpingboot01.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by longyi on 2018-03-22.
 */
@Entity
public class User {

    @Column(nullable = false)
    private String name;

    public User() {
    }

    @Id
    @GeneratedValue
    private Long id;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Column(nullable = false)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
