package com.company.arrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {

    private static final ArrayList<String> stringArrayList = new ArrayList<>();

    public static void main(String[] args) {

        methodAdd();
        contains();

    }

    private static void methodAdd() {
        stringArrayList.add("Tom");
        stringArrayList.add("Max");
        stringArrayList.add("Alla");
        stringArrayList.add("Ivan");
        stringArrayList.add("Fillip");


        print();
    }

    private static void contains() {
        boolean listContains = stringArrayList.contains("Max");
        System.out.println("Element Max in stringArrayList - " + listContains);
    }

    private static void print() {
        System.out.println("----------------------------------");
        for (String s : stringArrayList) {
            System.out.println("Name - " + s);
        }
        System.out.println("----------------------------------");
    }
}
