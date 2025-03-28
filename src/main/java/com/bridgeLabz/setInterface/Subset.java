package com.bridgeLabz.setInterface;

import java.util.HashSet;

public class Subset {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(3);
        boolean flag = set1.containsAll(set2);
        if(flag==true){
            System.out.println("set2 is subset of set1");
        }
        else{
            System.out.println("set2 is not subset of set1");
        }
    }
}
//set2 is subset of set1