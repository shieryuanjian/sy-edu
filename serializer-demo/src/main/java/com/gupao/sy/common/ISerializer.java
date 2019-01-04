package com.gupao.sy.common;

/**
 *@ClassName ISerializer
 *@Description 序列化和反序列化接口
 *@Author yong.shi.nj
 *@Date 2019/1/4 10:13
 *@Version 1.0
 **/
public interface ISerializer {
    /**
     *@Author yong.shi.nj
     *@Description 序列化方法
     *@Date 16:10 2019/1/4
     *@Param [obj]
     *@return byte[]
     **/
    <T> byte[] serializer(T obj);

    /**
     *@Author yong.shi.nj
     *@Description 反序列化方法
     *@Date 16:10 2019/1/4
     *@Param [bs]
     *@return T
     **/
    <T> T deserializer(byte[] data, Class<T> clazz);
}
