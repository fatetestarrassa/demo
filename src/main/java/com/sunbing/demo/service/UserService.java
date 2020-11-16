package com.sunbing.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunbing.demo.entity.ResponseResult;
import com.sunbing.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sunbing.demo.param.UserQueryParam;
import com.sunbing.demo.param.UserSaveParam;
import com.sunbing.demo.vo.UserPageVo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author sunbing
 * @since 2020-11-12
 */
public interface UserService extends IService<User> {
    IPage<UserPageVo> selectPageVo(Page page, UserQueryParam queryParam);
    ResponseResult saveEntity(UserSaveParam param);
}
