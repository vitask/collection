package com.company;

import java.util.ArrayList;

public class ArrayListMethodInEmployee {

    private static final ArrayList<Employee> employeeList = new ArrayList<>();
    private static final ArrayList<Employee> employeeListAddAll = new ArrayList<>();

    public static void main(String[] args) {
        employeeAdd();
        employeeRemove(employeeList.size()-1);
        print();
        employeeAddAll();

    }


    private static void employeeAdd (){

        Employee em1 = new Employee("Oleg",25,'m',"manager",15500);
        Employee em2 = new Employee("Vladimir",45,'m',"engineer",30000);
        Employee em3 = new Employee("Stepan",20,'m',"intern",3000);
        Employee em4 = new Employee("Olga", 29,'f',"hr",12000);
        Employee em5 = new Employee("Vladimir",45,'m',"engineer",30000);

        //add employee in list
        employeeList.add(em1);
        employeeList.add(em2);
        employeeList.add(em3);
        employeeList.add(em4);
        employeeList.add(em5);

        print();

        //method indexOf,  getting element index in arrayList
        int index = employeeList.indexOf(em5);
        System.out.println("Index em5 -  " + index);
        //method lastIndexOf, getting element last index in arrayList
        int lastIndex = employeeList.lastIndexOf(em5);
        System.out.println("Last Index em5 - " + lastIndex);
        //method size, getting size arrayList
        int sizeList = employeeList.size();
        System.out.println("Size employeeList - " + sizeList);
    }


    private static void employeeAddAll() {
        Employee em0 = new Employee("Mariya", 33, 'f', "clerk", 10000);

        employeeListAddAll.add(em0);
        employeeListAddAll.addAll(employeeList);
        System.out.println("new employeeList - " + employeeListAddAll);
    }


    private static void employeeRemove(int removeIndex) {
        //remove element in employeeList
        employeeList.remove(removeIndex);
    }

    public static void print (){
        System.out.println("----------------------------------");
        System.out.println("employeeList - " + employeeList);
        System.out.println("----------------------------------");

    }

}
