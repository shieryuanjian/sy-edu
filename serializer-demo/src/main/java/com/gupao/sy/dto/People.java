package com.gupao.sy.dto;/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 * Company: 快钱<p>
 *
 * @author yong.shi.nj
 * @since 2019/1/4 17:08
 */

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

    @Override
    public String toString() {
        return "com.gupao.sy.common.People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
