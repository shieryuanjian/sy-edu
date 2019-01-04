package com.gupao.sy.common;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 *@ClassName XmlSerializer
 *@Description xml实现序列化
 *@Author yong.shi.nj
 *@Date 2019/1/4 16:53
 *@Version 1.0
 **/
public class XmlSerializer implements ISerializer{
    XStream xStream = new XStream(new DomDriver());
    public <T> byte[] serializer(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    public <T> T deserializer(byte[] data, Class<T> clazz) {
        return (T)xStream.fromXML(new String(data));
    }
}
