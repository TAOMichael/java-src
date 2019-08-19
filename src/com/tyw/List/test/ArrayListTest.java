package com.tyw.list.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {


    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("3");

        list1.retainAll(list2);
        System.out.println(list1.toString());

    }


}
