package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * ¹¦ÄÜÃèÊö:
 *
 * @author yaoyizhou
 * @date 2019/10/11 17:44
 * @desc
 */
public class CircleDepandA {

    @Autowired
    private CircleDepandB b;

}
