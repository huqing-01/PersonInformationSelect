package com.yuanian.springboot.controller;

import com.yuanian.springboot.pojo.Data;
import com.yuanian.springboot.pojo.Person;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.util.JSONPObject;


@RestController
@CrossOrigin   //用来跨域
public class personController {

//    @Autowired
//    private Data data;

    //@RequestBody用于获取从前端传过来的值，前端传过来的是json数据，并且使用@RequestBody时
    //只能用post请求，不能用get请求。

    @PostMapping("person")
    public Person getData(@RequestBody JSONObject jsonobject) {
        //因为前端参数书“ "usercode": usercode,如果输入1，那这里获取到的就是{"usercode":"1"}
        System.out.println(jsonobject);

        /**
         通过JSONObject.getString(“键”)，通过键获取json数据的值，但是必须是直接下一级，
         就是紧挨着的一级，不能随随便便就根据键获取值。键是String类型，所以才是getString,
         如果是int类型，那就是getInteger
         因为Data类中的属性和方法都是静态属性和方法，所以这里可以直接用类名调用。
         *
         */
        return Data.getPersonByUsercode((jsonobject.getString("usercode")));
    }

}
