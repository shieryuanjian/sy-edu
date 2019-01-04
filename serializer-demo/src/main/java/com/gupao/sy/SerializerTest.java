package com.gupao.sy;

import com.gupao.sy.common.ISerializer;
import com.gupao.sy.common.JavaSerializer;
import com.gupao.sy.common.JsonSerializer;
import com.gupao.sy.dto.Email;
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
        Email email = new Email();
        email.setAccount("709187743@qq.com");
        p.setEmail(email);
        p.setName("shiyong");
        p.setAge(10);

        ISerializer serializer = new JavaSerializer();
        serializer.serializer(p);

        System.out.println(serializer.deserializer(null,null));

        serializer = new JsonSerializer();
        byte[] b = serializer.serializer(p);
        System.out.println(serializer.deserializer(b,People.class));


    }
}
