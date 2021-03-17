package com.sunbing.demo.mapper;

import com.sunbing.demo.entity.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 博客表 Mapper 接口
 * </p>
 *
 * @author sunbing
 * @since 2021-03-16
 */
public interface BlogMapper extends BaseMapper<Blog> {
    Blog selectBlog(Integer id);
    Blog selectBlog1(Integer id);
    Blog selectBlog3(Integer id);
}
