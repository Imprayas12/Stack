package StackImplementaion;

import myExeptions.InvalidChoiceException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================STACK IMPLEMENTATION==================");
        System.out.println("ENTER YOUR CHOICE FROM THE FOLLOWING OPTIONS :");
        int data=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Implement stack using ARRAY ");
        System.out.println("2. Implement stack using Singly Linked List ");
        System.out.println("3. Implement stack using Doubly Linked List ");
        System.out.println("4. I don't like stack ");
        System.out.println("5. EXIT");
        try {
            data = sc.nextInt();
            if(!(data>=1&&data <=5)) throw new InvalidChoiceException("Choose from the menu options only");
        } catch (InputMismatchException e){
            System.out.println("Enter integers only. Thank you for using our service.");
            return;
        } catch (InvalidChoiceException e){
            e.getMessage();
        }

        switch (data) {
            case 1 -> {
                Stack_using_arr st = new Stack_using_arr();
                int temp = 0;
                while (temp != 4) {
                    System.out.println("Which operation do you want to perform : ?");
                    System.out.println("1. Insert data : ");
                    System.out.println("2. Display top : ");
                    System.out.println("3. Pop all elements :");
                    System.out.println("4. EXIT :");
                    try {
                        temp = sc.nextInt();
                        if (!(temp >= 1 && temp <= 4))
                            throw new InvalidChoiceException("Choose from the menu options only");
                    } catch (InvalidChoiceException e) {
                        e.getMessage();
                        return;
                    }
                    switch (temp) {
                        case 1 -> st.push();
                        case 2 -> System.out.println(st.peek());
                        case 3 -> st.display();
                        case 4 -> System.exit(0);
                    }
                }
            }
            case 2 -> {
                Stack_using_LL st = new Stack_using_LL();
                int temp = 0;
                while (temp != 4) {
                    System.out.println("Which operation do you want to perform : ?");
                    System.out.println("1. Insert data : ");
                    System.out.println("2. Display top : ");
                    System.out.println("3. Pop all elements :");
                    System.out.println("4. EXIT :");
                    try {
                        temp = sc.nextInt();
                        if (!(temp >= 1 && temp <= 4))
                            throw new InvalidChoiceException("Choose from the menu options only");
                    } catch (InvalidChoiceException e) {
                        e.getMessage();
                        return;
                    }
                    switch (temp) {
                        case 1 -> st.push();
                        case 2 -> System.out.println(st.peek());
                        case 3 -> st.display();
                        case 4 -> System.exit(0);
                    }
                }
            }
            case 3 -> {
                Stack_using_DLL st = new Stack_using_DLL();
                int temp = 0;
                while (temp != 4) {
                    System.out.println("Which operation do you want to perform : ?");
                    System.out.println("1. Insert data : ");
                    System.out.println("2. Display top : ");
                    System.out.println("3. Pop all elements :");
                    System.out.println("4. EXIT :");
                    try {
                        temp = sc.nextInt();
                        if (!(temp >= 1 && temp <= 4))
                            throw new InvalidChoiceException("Choose from the menu options only");
                    } catch (InvalidChoiceException e) {
                        e.getMessage();
                        return;
                    }
                    switch (temp) {
                        case 1 -> st.push();
                        case 2 -> System.out.println(st.peek());
                        case 3 -> st.display();
                        case 4 -> System.exit(0);
                    }
                }
            }
            case 4 -> System.out.println("Even I don't like stack. ");
            default -> System.out.println("Enter valid input please.");
        }
    }
}
