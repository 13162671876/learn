package com.hjx.dubboconsmer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DubboConsmerApplication.class)
//@ContextConfiguration(locations = "classpath:spring-context.xml")
public class ConsumerTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private Consumer consumer;
    @Test
    public void testDubbo() {
        consumer.testDubbo();
    }
}