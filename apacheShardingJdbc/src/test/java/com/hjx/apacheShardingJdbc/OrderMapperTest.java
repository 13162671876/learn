package com.hjx.apacheShardingJdbc;

import com.hjx.apacheShardingJdbc.common.Order;
import com.hjx.apacheShardingJdbc.common.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApacheShardingJdbcApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testSharding(){
        Order order = new Order();
        order.setUserId(7l);
        order.setOrderId(19l);
        orderMapper.insert(order);
    }

}