package com.bridgeLabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
//before[1, 2, 3]
//After[3, 2, 1]