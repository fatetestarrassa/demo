package com.sunbing.demo.service;

import com.sunbing.demo.entity.Vehicle;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 车辆表 服务类
 * </p>
 *
 * @author sunbing
 * @since 2021-03-17
 */
public interface VehicleService extends IService<Vehicle> {
    Vehicle selectVehicle(Integer id);
}
