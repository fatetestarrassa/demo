package com.sunbing.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunbing.demo.entity.ResponseResult;
import com.sunbing.demo.param.UserQueryParam;
import com.sunbing.demo.param.UserSaveParam;
import com.sunbing.demo.service.UserService;
import com.sunbing.demo.vo.UserPageVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author sunbing
 * @since 2020-11-12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/listByPage",produces = "application/json;charset=UTF-8")
    public ResponseResult listByPage(@RequestBody UserQueryParam param){
        Page page = new Page(param.getCurrent(),param.getSize());
        IPage<UserPageVo> pageInfo = userService.selectPageVo(page,param);
        return ResponseResult.Success(pageInfo);
    }

    @PostMapping(value = "/save",produces = "application/json;charset=UTF-8")
    public ResponseResult save(@RequestBody UserSaveParam param){
        ResponseResult checkParamResult = checkParam(param);
        if(checkParamResult.getReturncode() != 0){
            return checkParamResult;
        }

        return  userService.saveEntity(param);
    }

    private ResponseResult checkParam(UserSaveParam param){
        if(StringUtils.isBlank(param.getUserName())){
            return ResponseResult.Fail("用户名不能为空");
        }
        if(StringUtils.isBlank(param.getPassword())){
            return ResponseResult.Fail("密码不能为空");
        }
        if(StringUtils.isBlank(param.getEmail())){
            return ResponseResult.Fail("邮箱不能为空");
        }
        return ResponseResult.Success("参数校验通过");
    }
}

