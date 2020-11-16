package com.sunbing.demo.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
import org.apache.commons.lang3.StringUtils;
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
    //适用性不好：1.返回的是User对象而非自定义vo 2.不能关联表
    public IPage<UserPageVo> selectPageVo1(Page page, UserQueryParam queryParam){
        QueryWrapper wrapper = new QueryWrapper();
        if(queryParam.getId() != null){
            wrapper.eq("id",queryParam.getId());
        }
        if(StringUtils.isNotBlank(queryParam.getUserName())){
            wrapper.like("user_name",queryParam.getUserName());
        }
        if(StringUtils.isNotBlank(queryParam.getEmail())){
            wrapper.like("email",queryParam.getEmail());
        }

        IPage<UserPageVo> pageInfo = page(page,wrapper);
        return pageInfo;
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
