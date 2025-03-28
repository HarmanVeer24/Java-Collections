package com.bridgeLabz.setInterface;
import java.util.HashSet;
public class UnionIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        HashSet<Integer> Intersection = new HashSet<>(set1);
        Intersection.retainAll(set2);
        System.out.println("Union "+union);
        System.out.println("Intersection "+Intersection);
    }
}
//Union [1, 2, 3, 4, 5]
//Intersection [3]