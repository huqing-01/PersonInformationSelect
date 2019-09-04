package com.yuanian.springboot.pojo;
import com.yuanian.springboot.pojo.Person;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class Data {
    //这里直接指定键key为String类型，value为Person类型
    private static Map<String, Person> persons = null;
    static {
        persons = new HashMap<String , Person>();
        //put方法就是往map集合中添加数据。
        persons.put("1",new Person("1","胡庆","技术开发部"));
        persons.put("2",new Person("2","马广交","人力资源部"));
        persons.put("3",new Person("3","刘睿祺","产品研发部"));
        persons.put("4",new Person("4","常瑞","共享交付部"));
    }

    public static Person getPersonByUsercode(String usercode){
        return persons.get(usercode);
        //persons是个map集合，可通过get方法，参数为key，返回值为value,这里的value是person对象。
    }

}