package com.company.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("J");
        StringBuilder sb2 = new StringBuilder("A");
        StringBuilder sb3 = new StringBuilder("V");
        StringBuilder sb4 = new StringBuilder("A");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};

        //method  Arrays.asList()
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        array[3].append("!");
        System.out.println(list);
    }
}
