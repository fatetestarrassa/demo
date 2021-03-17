package com.sunbing.demo.service.Impl;

import com.sunbing.demo.entity.Blog;
import com.sunbing.demo.mapper.BlogMapper;
import com.sunbing.demo.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客表 服务实现类
 * </p>
 *
 * @author sunbing
 * @since 2021-03-16
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {
    @Override
    public Blog selectBlog(Integer id) {
        return this.baseMapper.selectBlog(id);
    }

    @Override
    public Blog selectBlog1(Integer id) {
        return this.baseMapper.selectBlog1(id);
    }

    @Override
    public Blog selectBlog3(Integer id) {
        return this.baseMapper.selectBlog3(id);
    }
}
