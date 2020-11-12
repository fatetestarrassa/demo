package com.sunbing.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunbing.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunbing.demo.param.UserQueryParam;
import com.sunbing.demo.vo.UserPageVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author sunbing
 * @since 2020-11-12
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<UserPageVo> selectPageVo(Page page, @Param("queryParam") UserQueryParam queryParam);

}
