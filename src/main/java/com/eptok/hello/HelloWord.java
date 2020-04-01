package com.eptok.hello;

import java.util.ArrayList;

public class HelloWord {


    public static void main(String[] agers){
        System.out.println("hello word");
        ArrayList array = new ArrayList();
        array.add("kongtiao");
        array.add("diannao");
        array.add("shubiao");
        array.add("jianpan");
        array.add("dianshi");
        array.add("yinxiang");


        final HelloWord helloWord = new HelloWord();

        Class<? extends Class> aClass = helloWord.getClass().getClass();

        System.out.println(aClass);
    }

}
