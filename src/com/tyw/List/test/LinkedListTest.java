package com.tyw.list.test;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {


    @Test
    public void test1() {

        LinkedList<String> linkedList = new LinkedList();
        //普通添加
        linkedList.add("1");

        linkedList.add("2");
        //首位添加
        linkedList.addFirst("3");
        //末位添加
        linkedList.addLast("4");


        LinkedList<String> linkedList2 = new LinkedList();

        linkedList2.add("5");

        linkedList2.add("6");

        //末位添加list
        linkedList.addAll(linkedList2);

        //指定位置添加list
        linkedList.addAll(2, linkedList2);

        //末位添加===add===addFirst
        linkedList.offer("111111");

        //首位添加===addFirst
        linkedList.offerFirst("22222");

        //末位添加===addLast
        linkedList.offerLast("33333");

        //首位添加===addFirst
        linkedList.push("444444");


        Console.log(linkedList.toString());

    }

    @Test
    public void test2() {

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("2");


        //获取元素首次出现的索引
        Console.log(linkedList.indexOf("2"));

        //获取元素最后一次出现的索引
        Console.log(linkedList.lastIndexOf("2"));

        //获取首元素===getFirst
        Console.log(linkedList.element());


        Console.log(linkedList.peekLast());

        Console.log(linkedList.getLast());

        Console.log(linkedList.peek());


        Console.log(linkedList.toString());

    }


}
