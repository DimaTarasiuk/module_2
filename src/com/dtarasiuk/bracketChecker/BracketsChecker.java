package com.dtarasiuk.bracketChecker;

import java.util.Stack;

public class BracketsChecker {
    public static void checkBrackets(String symbols) {
        // the Stack to which we compare to
        String brackets = "[{()}]";
        Stack<String> stack1 = new Stack<String>();
        stack1.push(brackets);
        System.out.println("Stack 1 is : " + stack1);

        // the stack which we check
        Stack<String> stack = new Stack<String>();
        stack.push(symbols);
        System.out.println("Stack 2 is : " + stack);

        if (stack.equals(stack1) == true)
            System.out.println("comparing stacks: " + stack.equals(stack1));
        else{
            System.out.println("different stack of brackets: ");
            for (int i = 0; i< symbols.length(); i++){
                System.out.println(symbols.charAt(i));
            }

        }

    }
    public static void main(String[] args) {
       checkBrackets("[{()}");
    }



}
