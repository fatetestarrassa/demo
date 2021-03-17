package com.sunbing.demo.service.Impl;

import com.sunbing.demo.entity.Vehicle;
import com.sunbing.demo.mapper.VehicleMapper;
import com.sunbing.demo.service.VehicleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆表 服务实现类
 * </p>
 *
 * @author sunbing
 * @since 2021-03-17
 */
@Service
public class VehicleServiceImpl extends ServiceImpl<VehicleMapper, Vehicle> implements VehicleService {
    @Override
    public Vehicle selectVehicle(Integer id) {
        return this.baseMapper.selectVehicle(id);
    }
}
