package com.sunbing.demo.service.Impl;

import com.sunbing.demo.entity.User;
import com.sunbing.demo.mapper.UserMapper;
import com.sunbing.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author sunbing
 * @since 2020-11-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
