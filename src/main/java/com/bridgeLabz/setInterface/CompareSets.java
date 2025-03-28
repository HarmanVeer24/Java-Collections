package com.bridgeLabz.setInterface;
import java.util.HashSet;
public class CompareSets {
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        int n = set2.size();
        set2.addAll(set1);
        if(set2.size()>n){
            System.out.println("Sets are not Equal");
        }
        else{
            System.out.println("Sets are Equal");
        }
    }
}
