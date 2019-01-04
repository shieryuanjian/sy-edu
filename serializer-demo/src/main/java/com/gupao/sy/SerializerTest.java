package com.gupao.sy;

import com.gupao.sy.common.JavaSerializer;
import com.gupao.sy.dto.People;

/**
 *@ClassName SerializerTest
 *@Description TODO
 *@Author yong.shi.nj
 *@Date 2019/1/4 17:07
 *@Version 1.0
 **/
public class SerializerTest {
    public static void main(String[] args) {
        People p = new People();
        p.setName("shiyong");
        p.setAge(10);

        JavaSerializer javaSerializer = new JavaSerializer();
        javaSerializer.serializer(p);

        System.out.println(javaSerializer.deserializer(null,null));

    }
}
