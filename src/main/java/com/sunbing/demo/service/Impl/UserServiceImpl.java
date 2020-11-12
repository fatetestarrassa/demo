package com.sunbing.demo.service.Impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunbing.demo.entity.ResponseResult;
import com.sunbing.demo.entity.User;
import com.sunbing.demo.mapper.UserMapper;
import com.sunbing.demo.param.UserQueryParam;
import com.sunbing.demo.param.UserSaveParam;
import com.sunbing.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunbing.demo.vo.UserPageVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public IPage<UserPageVo> selectPageVo(Page page, UserQueryParam queryParam){
        return this.baseMapper.selectPageVo(page,queryParam);
    }

    @Override
    public ResponseResult saveEntity(UserSaveParam param) {
        User entity = new User();
        entity.setUserName(param.getUserName()).setPassword(param.getPassword()).setEmail(param.getEmail());
        boolean isSuccess = save(entity);
        if(isSuccess){
            return ResponseResult.Success("保存成功");
        }
        return ResponseResult.Fail("保存失败");
    }
}
