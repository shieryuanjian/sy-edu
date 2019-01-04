package com.gupao.sy.common;

import com.alibaba.fastjson.JSON;

/**
 *@ClassName JsonSerializer
 *@Description JSON实现序列化
 *@Author yong.shi.nj
 *@Date 2019/1/4 17:03
 *@Version 1.0
 **/
public class JsonSerializer implements ISerializer{
    public <T> byte[] serializer(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    public <T> T deserializer(byte[] data, Class<T> clazz) {
        return JSON.parseObject(new String(data),clazz);
    }
}
