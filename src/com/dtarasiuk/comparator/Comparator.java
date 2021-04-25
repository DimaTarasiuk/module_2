package com.dtarasiuk.comparator;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.Collection;

public class Comparator {

    public static void comparate (Collection<Integer> num1, Collection<Integer> num2){
        System.out.println("first column: " + num1);
        System.out.println("second column: " + num2);
        num1.retainAll(num2);
        System.out.println("these elements in both collections: " + num1);
    }

    public static void main(String[] args) {
        // generating random numbers for test
        Collection<Integer> num1 = new ArrayList<>(15);
        Collection<Integer> num2 = new ArrayList<>(15);
        for (int i = 0; i<5; i++){
            num1.add((int) (Math.random() *10));
            num2.add((int) (Math.random() *10));
        }

        comparate(num1, num2);

        }
    }

