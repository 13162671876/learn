package com.hjx.design;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;

import java.io.*;
import java.util.Properties;

/**
 * @Desc
 * @Author jianxiong.huang
 * @Date 2020/10/22 21:03
 * @Version 1.0.0
 */
public class BeanDefintion {

    public static void main(String[] args) {
        // 通常为BeanDefinitionRegistry的实现类，这里以DeFaultListabeBeanFactory为例
        BeanDefinitionRegistry beanRegistry = new DefaultListableBeanFactory();
        // XmlBeanDefinitionReader实现了BeanDefinitionReader接口，用于解析XML文件
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanRegistry);


        File file = new File("classpath:spring-bean.xml");
        InputStream in = null;
        try {
            in = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

        Resource resource = new InputStreamResource(in);
        // 加载配置文件
        beanDefinitionReader.loadBeanDefinitions(resource);
        // 从容器中获取bean实例
        BeanFactory container = (BeanFactory) beanRegistry;
    }

}
