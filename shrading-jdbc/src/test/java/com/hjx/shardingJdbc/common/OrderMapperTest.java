package com.hjx.shardingJdbc.common;

import com.hjx.shardingJdbc.ShardingJDBCApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShardingJDBCApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSharding(){
        Order order = new Order();
        order.setUserId(7l);
        order.setOrderId(22l);
        orderMapper.insert(order);
    }

}