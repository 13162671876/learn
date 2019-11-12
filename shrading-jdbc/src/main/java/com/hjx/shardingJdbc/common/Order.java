package com.hjx.shardingJdbc.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/17
 **/
@Data
public class Order implements Serializable {


    private static final long serialVersionUID = 192011996809298706L;
    private Long id;

    private Long userId;
    private Long orderId;

}
