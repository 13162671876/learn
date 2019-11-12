package com.hjx.apacheShardingJdbc.common;


import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Desc
 * @Author huangjianxiong
 * @Date 2019/10/17
 **/
@Repository
public interface OrderMapper {

     Integer insert(Order order);

     List<Order> queryAll();
}
