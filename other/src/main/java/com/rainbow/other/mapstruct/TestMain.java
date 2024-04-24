package com.rainbow.other.mapstruct;

import com.rainbow.other.mapstruct.model.Demo1;
import com.rainbow.other.mapstruct.model.Demo2;

/**
 * @author yanzhihao
 * @since 2023/6/28
 */
public class TestMain {

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.setUsername(null);
        Demo2 result2 = Convert.CONVERT.convert(demo1);
        System.out.println("result2 = " + result2);
    }
}
