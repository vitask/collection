package com.company.linkedList;

import java.util.LinkedList;

public class LinkedListExample {

    private static final LinkedList<Student> studentLinkedList = new LinkedList<>();


    public static void main(String[] args) {

        addAndRemoveStudent();

        addFirstAndLast();

        removeFirstAndLast();

    }

    public static void addAndRemoveStudent(){
        Student student1 = new Student("Vladimir",4);
        Student student2 = new Student("Olga",1);
        Student student3 = new Student("Petr",2);
        Student student4 = new Student("Ivan",2);
        Student student5 = new Student("Kolya",3);

        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);
        studentLinkedList.add(student4);
        studentLinkedList.add(student5);

        System.out.println("initial list");
        print();

        Student student6 = new Student("Natasha", 2);
        Student student7 = new Student("Misha",1)  ;

        studentLinkedList.add(1,student6); //add element "student6" between "student1" and "student2"
        studentLinkedList.add(4,student7);//add element "student7" between "student3" and "student4"

        System.out.println("list after adding elements to the index 1 and 4");
        print();

        studentLinkedList.remove(4);// delete element "student7"

        System.out.println("list after remove element at index 4");
        print();

    }

    private static void addFirstAndLast(){
        Student student8 = new Student("Vitalya",2);
        Student student9 = new Student("Semen",4);

        studentLinkedList.addFirst(student8);// added elements "student8" and "student9"
        studentLinkedList.addLast(student9);// in position "0" and "studentLinkedList.size - 1"

        System.out.println("list after added elements to the" +
                " first and last position");
        print();
    }

    private static void removeFirstAndLast(){

        studentLinkedList.removeFirst();// deleted elements from position
        studentLinkedList.removeLast();// "0"and "studentLinkedList.size - 1"

        System.out.println("list after remove elements at" +
                " first and last position");
        print();
    }


    public static class Student {
        private final String name;
        private final int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return "name - " + name +
                    ", course - " + course;
        }
    }

    private static void print(){
        System.out.println("studentLinkedList - " + studentLinkedList);
        System.out.println("---------------------------------------------------");
    }

}
