package com.Stack;

import java.util.Stack;

public class Stackuc2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Stack and queue");
        Stack stack = new Stack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("the added nubers are "+stack);
        System.out.println("after pop element is"+stack.pop());
        System.out.println("the added nubers are "+stack);
        System.out.println("after peek element is"+stack.peek());
        System.out.println(" element is"+stack);
        System.out.println("after pop element is"+stack.pop());
        System.out.println(" element is"+stack);
        System.out.println("after pop element is"+stack.pop());
        System.out.println(" element is"+stack);
    }
}

