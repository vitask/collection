package com.company.Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        stringIsPalindrome("madam");
        stringIsPalindrome("oleg");
        stringIsPalindrome("WasSAmASSaw");
    }

    private static void stringIsPalindrome(String s){

        List<Character> list = new LinkedList<>();
        for(char ch : s.toLowerCase().toCharArray()){
            list.add(ch);
        }
        //get accessing the collection from left to right (->)
        ListIterator<Character> iterator = list.listIterator();
        //get accessing the collection from right to left (<-)
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        boolean isPalindrome = true;
        //compare first element and last
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            //if first element not equal last element, then isPalindrome - false
            if(iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
