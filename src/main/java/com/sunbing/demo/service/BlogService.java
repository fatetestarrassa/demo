package com.sunbing.demo.service;

import com.sunbing.demo.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 博客表 服务类
 * </p>
 *
 * @author sunbing
 * @since 2021-03-16
 */
public interface BlogService extends IService<Blog> {
    Blog selectBlog(Integer id);
    Blog selectBlog1(Integer id);
    Blog selectBlog3(Integer id);
}
