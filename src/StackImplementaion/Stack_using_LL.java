package StackImplementaion;
import Nodes.Node;
import myExeptions.SortError;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Stack_using_LL {
    Node top;
    public Stack_using_LL(){
        top = null;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public void push(Node newNode){
        newNode.setNext(top);
        top = newNode;
    }
    public void push() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new data :");
        int data = 0;
        try {
            data = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Enter integers only.");
            return;
        }
        Node newNode = new Node(data);
        if (!isEmpty()) {
            try {
                if (top.getData() > data) throw new SortError();
            } catch (SortError e) {
                e.check(top.getData(), data);
                return;
            }
            newNode.setNext(top);
        }
        top = newNode;

    }
    public void push(int data){
     Node newNode = new Node(data);
     newNode.setNext(top);
     top = newNode;
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
         return -1;
        }
        else {
            int data = top.getData();
            top = top.getNext();
            return data;
        }
    }
    public int peek(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.getData();
        }
    }
    public void empty(){
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
