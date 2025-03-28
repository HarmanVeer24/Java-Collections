package com.bridgeLabz.ListInterface;
import java.util.Scanner;

class NodeX {
    int data;
    NodeX next;

    NodeX(int data, NodeX next) {
        this.data = data;
        this.next = next;
    }

    NodeX(int data) {
        this.data = data;
        next = null;
    }
}

public class NthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int deletionNode = sc.nextInt();
        NodeX head = new NodeX(sc.nextInt());
        NodeX temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new NodeX(sc.nextInt());
            temp = temp.next;
        }
        NodeX slow = head;
        NodeX fast = head;
        int i = 0;
        while (i < deletionNode) {
            fast = fast.next;
            i++;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if (slow.next != null && slow.next.next != null) {
            slow.next = slow.next.next;
        } else {
            slow.next = null;
        }
        NodeX temp1 = head;
        while (temp1 != null) {
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
    }
}