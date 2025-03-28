package com.bridgeLabz.ListInterface;

import java.util.ArrayList;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <n; i++) {
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size()/2;i++){
            int temp = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1,temp);
        }
        for(int i=0;i<n;i++){
            System.out.print(list.get(i) + " ");
        }
        Node Head = new Node(sc.nextInt()); // Initialize the head with the first element
        Node temp = Head;
        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        Node temp1 = Head;
        Node prev = null;
        while (temp1 != null) {
            Node forward = temp1.next;
            temp1.next = prev;
            prev = temp1;
            temp1 = forward;
        }
        while (prev != null) {
            System.out.print(prev.data + " ");
            prev = prev.next;
        }
    }
}

// output
//5
// 1 2 3 4 5
// 5 4 3 2 1
// 8 1 2 5 6
// 6 5 2 1 8
