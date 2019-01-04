package com.gupao.sy.common;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *@ClassName JavaSerializer
 *@Description java实现序列化方法
 *@Author yong.shi.nj
 *@Date 2019/1/4 16:11
 *@Version 1.0
 **/
public class JavaSerializer implements ISerializer {

    public <T> byte[] serializer(T obj) {
        ObjectOutputStream oos = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> T deserializer(byte[] bs) {
        ObjectInputStream ois;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(bs);
            ois = new ObjectInputStream(bis);
            return (T)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
