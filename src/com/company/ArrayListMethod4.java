package com.company;

import java.util.*;

public class ArrayListMethod4 {

    private static final ArrayList<String> nameArray = new ArrayList<>();
    private static final ArrayList<String> nameArray2 = new ArrayList<>();

    public static void main(String[] args) {
        methodAdd();
        methodAddAll();
        sort();
        retainAll();
        removeAll();
        toArray();
        subList();
    }

    private static void methodAdd() {
        nameArray.add("Tom");
        nameArray.add("Max");
        nameArray.add("Alla");
        nameArray.add("Ivan");
        nameArray.add("Fillip");
        print(nameArray);

    }
    private static void methodAddAll(){
        nameArray2.add("Kolya");
        nameArray2.add("Petr");
        nameArray2.add("Mariya");
        nameArray2.addAll(nameArray);
        print(nameArray2);

    }

    private static void sort(){
        Collections.sort(nameArray);
        System.out.println("Sorting array - " + nameArray);
    }


    private static void removeAll(){
        //method removeAll
        System.out.println("Method removeAll");
        nameArray2.removeAll(nameArray);
        print(nameArray2);
    }
    private static void retainAll(){
        //method retainAll
        System.out.println("Method retainAll");
        nameArray.retainAll(nameArray2);
        print(nameArray);

    }

    private static void subList(){
        //method subList -> Max,Alla,Ivan
        List<String> newList = nameArray.subList(1,4);
        newList.add("Elena");
        System.out.println("Method subList - " + newList);
        System.out.println("new nameArray - " + nameArray);
    }

    private static void toArray(){
        Object[] arrayObject = nameArray.toArray();
        String[] arrayString = nameArray.toArray(new String[0]);
        for (String s : arrayString)
            System.out.println(s);
        System.out.println("----------------------------------");
        for (Object o : arrayObject)
            System.out.println(o);
        System.out.println("----------------------------------");
    }

    public static void print (ArrayList array){
        System.out.println("Array - "  + array);
        System.out.println("----------------------------------");

    }
}
