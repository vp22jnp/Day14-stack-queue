package com.Stack;

public class stack {
    LinkedList linkedList=new LinkedList();
    /*
    stack push
     */
    public void push(Object data){
        linkedList.addFirst(data);
    }

    public void pop(){
        while(linkedList.head!=null)
            linkedList.deleteFirst();
    }
    public void displayStack(){
        linkedList.display();
    }
}

