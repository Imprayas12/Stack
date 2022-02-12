package StackImplementaion;

import myExeptions.SortError;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stack_using_arr {
    int[] stack;
    int top;
    static Scanner sc;
    public Stack_using_arr(){
        System.out.println("Enter size of stack please :");
        sc = new Scanner(System.in);
        stack = new int[sc.nextInt()];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == stack.length - 1;
    }
    public void push(int data){
        if(isFull()) System.out.println("Stack Overflow");
        else stack[++top] = data;
    }

    public void push() {
        sc = new Scanner(System.in);
        if(!isFull()) {
            System.out.println("Enter data :");
            int data;
            try {
                data = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter integers only");
                return;
            }
            if (!isEmpty()) {
                try {
                    if (stack[top] > data) throw new SortError();
                } catch (SortError e) {
                    e.check(stack[top], data);
                    return;
                }
            }
            stack[++top] = data;
        }
        else {
            System.out.println("Stack Overflow");
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else return stack[top];
    }
    public int pop(){
        if(!isEmpty()){
            return stack[top--];
        }
        else{
            System.out.println("Stack Underflow");
            return -1;
        }
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
