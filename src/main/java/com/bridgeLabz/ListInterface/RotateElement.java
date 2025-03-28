package com.bridgeLabz.ListInterface;

import java.util.ArrayList;

public class RotateElement {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int rotationNumber = 2;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=rotationNumber;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<rotationNumber;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
//input
//10 20 30 40 50
//output
//30 40 50 10 20