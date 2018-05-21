package com.quartz;/**
 * Created by chenjia on 2018/5/21.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenjia
 * @create 2018-05-21 15:50
 * @desc
 **/
public class QuartzTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-quartz.xml");


    }

}
