package com.atguigu.test;

import com.atguigu.config.MainConfigOfCyleDepends;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_CycleDepends {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfCyleDepends.class);

    }

}
