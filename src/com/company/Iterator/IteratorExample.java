package com.company.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> nameArray = new ArrayList<>();
        nameArray.add("Tom");
        nameArray.add("Max");
        nameArray.add("Alla");
        nameArray.add("Ivan");
        nameArray.add("Fillip");

        System.out.println(nameArray);

        Iterator<String> iterator = nameArray.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(nameArray);
    }
}
