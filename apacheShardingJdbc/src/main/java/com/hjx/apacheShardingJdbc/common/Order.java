package com.hjx.apacheShardingJdbc.common;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
