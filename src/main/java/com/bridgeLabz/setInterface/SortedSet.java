package com.bridgeLabz.setInterface;

import java.util.TreeSet;
import java.util.HashSet;

public class SortedSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(9);
        set1.add(75);
        set1.add(34);
        set1.add(12);
        set1.add(65);
        set1.add(23);
        set1.add(98);
        System.out.println(set1);
        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.addAll(set1);
        System.out.println(treeset);
    }
}
//before sorting
//[1, 65, 34, 98, 3, 23, 9, 75, 12]
//after sorting
//[1, 3, 9, 12, 23, 34, 65, 75, 98]