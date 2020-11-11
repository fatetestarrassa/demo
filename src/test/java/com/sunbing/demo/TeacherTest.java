package com.sunbing.demo;

import com.sunbing.demo.entity.Teacher;
import com.sunbing.demo.mapper.TeacherMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author sunbing
 * @version 1.0
 * @since 2020/11/11 13:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherTest {

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void test(){
        List<Teacher> list = teacherMapper.selectList(null);
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}
