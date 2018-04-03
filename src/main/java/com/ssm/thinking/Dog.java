package com.ssm.thinking;


/**
 * Created by zhengxgs on 2017/12/25.
 */
public class Dog {

    String name;
    String says;

    public Dog(String name, String says) {
        super();
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("spot","Ruff");
        Dog d2 = new Dog("scruffy","Wurf");
        System.out.println(d1.says);
        System.out.println(d2.says);
        Dog d3 = d1;
        System.out.println(d1 == d2);
        System.out.println(d1 == d3);
        System.out.println(d2 == d3);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d2.equals(d3));

        int x = 0, y = 1, z = 2;
        String s = "x,y,z";
        System.out.println(s + x + y + z);

        double b = 2.93;
        int i = (int) b;
        System.out.println(i);

    }

}