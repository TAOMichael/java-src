package com.tyw.list.test;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    @Test
    public void test1() {
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");


        Console.log(list1.toString());

    }


}
