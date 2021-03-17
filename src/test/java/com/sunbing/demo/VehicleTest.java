package com.sunbing.demo;

import com.sunbing.demo.entity.CarResult;
import com.sunbing.demo.entity.Vehicle;
import com.sunbing.demo.service.VehicleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sunbing
 * @version 1.0
 * @since 2021/3/17 15:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleTest {
    @Autowired
    private VehicleService vehicleService;

    @Test
    public void test(){
        Vehicle vehicle = vehicleService.selectVehicle(1);
        vehicle = (CarResult) vehicle;
        System.out.println(vehicle);
    }
}
