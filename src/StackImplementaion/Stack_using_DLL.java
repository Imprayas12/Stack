package StackImplementaion;

import Nodes.NodeD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stack_using_DLL {
    NodeD top;
    public Stack_using_DLL(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    static Scanner sc;
    public void push(){
        sc = new Scanner(System.in);
        int data;
        System.out.print("Enter data : ");
        data = sc.nextInt();
        try{
            data = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Enter integers only");
            return;
        }
        NodeD newNode = new NodeD(data);
        push(newNode);
    }
    public void push(NodeD newNode){
        if(!isEmpty()){
            top.setPrev(newNode);
            newNode.setNext(top);
            newNode.setPrev(null);
        }
        top = newNode;
    }
    public void push(int data){
        NodeD newNode = new NodeD(data);
        push(newNode);
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else return top.getData();
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        else if(top.getNext() == null){
            int temp = top.getData();
            top = null;
            return temp;
        }
        else{
            int temp = top.getData();
            top = top.getNext();
            top.setPrev(null);
            return temp;
        }
    }
    public void emptyStack(){
        top = null;
    }
    public void display(){
        while (!isEmpty()){
            System.out.print(pop()+"->");
        }
        if(isEmpty()) System.out.print("null");
        System.out.println();
        System.out.println("Stack emptied.");
    }
}
