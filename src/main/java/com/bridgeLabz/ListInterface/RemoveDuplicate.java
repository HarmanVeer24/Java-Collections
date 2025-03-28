package com.bridgeLabz.ListInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr = {3, 1, 2, 2, 3, 4};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
