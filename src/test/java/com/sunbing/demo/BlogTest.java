package com.sunbing.demo;

import com.sunbing.demo.entity.Blog;
import com.sunbing.demo.service.BlogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sunbing
 * @version 1.0
 * @since 2021/3/16 16:25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void testSelectBlog(){
//        Blog blog = blogService.selectBlog(1);
//        Blog blog1 = blogService.selectBlog1(1);
        Blog blog3 = blogService.selectBlog3(1);
        System.out.println(11111);
    }

}
