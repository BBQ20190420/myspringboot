package com.bqq.myspring;

import com.bqq.myspring.bean.Person;
import com.bqq.myspring.service.HelloSerivce;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringApplicationTests {

    @Autowired
    Person person;


    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b=ioc.containsBean("helloSerivce");
        System.out.println(b);
    }

//    @Test
//    public void contextLoads() {
//        System.out.println(person);
//    }

}
