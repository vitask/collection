package com.company;

import java.util.ArrayList;

public class ArrayListMethods1 {

    private static final ArrayList<String> arrayList = new ArrayList<>();


    public static void main(String[] args) {
        methodAddAndSet();
        print();
        methodGet();
        methodSet();
        print();
        methodRemove();
        print();

    }

    public static void methodAddAndSet() {
        //method add
        arrayList.add("Oleg");
        arrayList.add("Ivan");
        arrayList.add("Sasha");
        arrayList.add(0, "Misha");
    }

    public static void methodGet() {
        //method get(int index)
        String methodGet = arrayList.get(0);
        System.out.println("Нулевой элемент массива - " + methodGet);
        System.out.println("----------------------------------");
    }

    public static void methodSet() {
        //method set(int index)
        arrayList.set(1, "Petr");
    }

    public static void methodRemove() {
        //remove last element
        arrayList.remove(arrayList.size() - 1);
    }

    public static void print() {
        //for-each and print on console
        for (String s : arrayList) {
            String format = String.format("Name - %s.", s);
            System.out.println(format);
        }
        System.out.println("----------------------------------");
    }
}
