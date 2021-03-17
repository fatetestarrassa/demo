package com.sunbing.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 车辆表
 * </p>
 *
 * @author sunbing
 * @since 2021-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Vehicle extends Model<Vehicle> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 识别码
     */
    private String vin;

    /**
     * 生产年份
     */
    private Integer year;

    /**
     * 生产国家
     */
    private String make;

    /**
     * 车型
     */
    private String model;

    /**
     * 颜色
     */
    private String color;

    /**
     * 车辆类型
     */
    private Integer vehicleType;

//    /**
//     * 车门数
//     */
//    private Integer doorCount;

    /**
     * 内包装尺寸
     */
    private Integer boxSize;

    /**
     * 扩展驾驶室
     */
    private Integer extendedCab;

    /**
     * 是否推拉门
     */
    private Integer powerSlidingDoor;

    /**
     * 是否全轮驱动
     */
    private Integer allWheelDrive;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
