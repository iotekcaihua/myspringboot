package com.caihua.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Alias("User")
public class User {
    private int id;
    private String name;
    private int age;
    //@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date birth;

    private SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public User(String name, int age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public User() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return sim.format(birth);
    }

    public void setBirth(Date birth)  {
        this.birth=birth;
    }
}
