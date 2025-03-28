package com.bridgeLabz.ListInterface;
import java.util.HashMap;
public class StringList {
    public static void main(String[] args){
        String[] arr = {"Apple", "Banana", "Banana", "Guava", "Mango", "Apple", "Mango", "Mango", "WaterMelon"};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(HashMap.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(key+" "+frequency);
        }
    }
}
