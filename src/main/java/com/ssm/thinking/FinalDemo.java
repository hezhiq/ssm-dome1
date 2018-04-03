package com.ssm.thinking;

/**
 * Created by zhengxgs on 2018/2/10.
 */
public class FinalDemo {

    public static final String s = "abc";

    public static void main(String[] args) {
       String s1 = s;
        s1 = s1.replace("a","c");
        System.out.println(s1);
    }

}