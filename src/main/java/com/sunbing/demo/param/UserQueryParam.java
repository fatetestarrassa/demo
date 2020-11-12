package com.sunbing.demo.param;

import lombok.Data;

/**
 * @author sunbing
 * @version 1.0
 * @since 2020/11/12 16:07
 */
@Data
public class UserQueryParam {
    private Integer id;
    private String userName;
    private String email;
    private Long current = 1L;
    private Long size = 10L;
}
