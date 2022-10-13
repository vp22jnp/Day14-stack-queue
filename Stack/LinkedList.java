package com.Stack;
import java.util.Scanner;
public class LinkedList {
    Scanner scanner = new Scanner(System.in);

    Node head;

    public void deleteFirst() {
    }

    class Node {
        Object data;
        Node next;//next is a reference

        public Node(Object data) {
            this.data = data;
        }
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        if (head == null)
            System.out.println("No elements to display");
        else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}