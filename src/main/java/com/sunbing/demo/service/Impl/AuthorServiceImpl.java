package com.sunbing.demo.service.Impl;

import com.sunbing.demo.entity.Author;
import com.sunbing.demo.mapper.AuthorMapper;
import com.sunbing.demo.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 作者表 服务实现类
 * </p>
 *
 * @author sunbing
 * @since 2021-03-16
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

}
