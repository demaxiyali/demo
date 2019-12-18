package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Java的任意进制间转换
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BinarySystemApplicationTests {

    @Test
    public void test(){
        System.out.println("十进制转换到其它进制：");
        int x = 123;

        String str1 = Integer.toHexString(x);       //10进制转换为16进制字符串
        System.out.println("16进制：" + str1);

        String str2 = Integer.toOctalString(x);     //10进制转换为8进制字符串
        System.out.println("8进制：" + str2);

        String str3 = Integer.toBinaryString(x);    //10进制转换为2进制字符串
        System.out.println("2进制：" + str3);
    }

}
