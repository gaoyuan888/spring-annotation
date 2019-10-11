package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * π¶ƒ‹√Ë ˆ:
 *
 * @author yaoyizhou
 * @date 2019/10/11 17:45
 * @desc
 */
public class CircleDepandB {
    @Autowired
    private CircleDepandA a;

//    public CircleDepandB(CircleDepandA a) {
//        this.a = a;
//    }

    //    public CircleDepandA getA() {
//        return a;
//    }
//
//    public void setA(CircleDepandA a) {
//        this.a = a;
//    }
}
