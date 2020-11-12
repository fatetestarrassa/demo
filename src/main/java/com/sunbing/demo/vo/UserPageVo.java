package com.sunbing.demo.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author sunbing
 * @version 1.0
 * @since 2020/11/12 16:07
 */
@Data
public class UserPageVo {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private LocalDateTime createdStime;
}
