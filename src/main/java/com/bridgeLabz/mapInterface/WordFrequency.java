package com.bridgeLabz.mapInterface;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String temp = "Hello world Hello java";
        String[] arr = temp.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            wordCountMap.put(arr[i],wordCountMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(wordCountMap);
    }
}
//{world=1, java=1, Hello=2}