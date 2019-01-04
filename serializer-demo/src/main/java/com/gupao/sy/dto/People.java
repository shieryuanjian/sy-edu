package com.gupao.sy.dto;
import java.io.Serializable;

/**
 *@ClassName com.gupao.sy.common.People
 *@Description TODO
 *@Author yong.shi.nj
 *@Date 2019/1/4 17:08
 *@Version 1.0
 **/
public class People implements Serializable {
    private static final long serialVersionUID = -8606501002336174116L;
    private String name;
    private Integer age;

    private Email email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email=" + email +
                '}';
    }
}
