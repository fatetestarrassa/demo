package com.sunbing.demo.mapper;

import com.sunbing.demo.entity.Vehicle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;

/**
 * <p>
 * 车辆表 Mapper 接口
 * </p>
 *
 * @author sunbing
 * @since 2021-03-17
 */
public interface VehicleMapper extends BaseMapper<Vehicle> {
    Vehicle selectVehicle(Integer id);
}
