package com.sunbing.demo;

import com.sunbing.demo.annotation.MyField;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author sunbing
 * @version 1.0
 * @since 2021/1/25 14:25
 */
public class MyFieldTest {

    @MyField(description = "名称字段",len = 12)
    private String name;


    @Test
    public void Test(){
        Class c = MyFieldTest.class;

        for(Field f : c.getDeclaredFields()){
            if(f.isAnnotationPresent(MyField.class)){
                MyField annotation = f.getAnnotation(MyField.class);
                System.out.println("属性名：" + f.getName() + ",描述：" + annotation.description() + ",长度:" + annotation.len());
            }
        }
    }
}
