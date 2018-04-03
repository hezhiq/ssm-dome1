package com.ssm.thinking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhengxgs on 2018/1/17.
 */
public class ConnectionDemo {

    ConnectionDemo(){
        System.out.println("我是ConnectionDemo的构造器");
    }

    static {
        System.out.println("我是静态代码块");
    }

    {
        System.out.println("我是普通代码块");
    }

    public static void main(String[] args) {
        List strList = new ArrayList();
        strList.add("www.");
        strList.add("tiantian");
        strList.add("bianma");
        strList.add(".com");
        System.out.println("ArrayList Elements : " + strList);

        Set strSet = new HashSet();
        strSet.add("好好");
        strSet.add("学习");
        strSet.add("天天");
        strSet.add("编码");
        System.out.println("HashSet Elements : " + strSet);
        new ConnectionDemo();
    }

}