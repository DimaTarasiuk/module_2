package com.dtarasiuk.bracketChecker;

import java.util.Stack;

public class BracketsChecker {
    public static void checkBrackets(String symbols) {
        // the Stack to which we compare to
        String brackets = "[{()}]";
        Stack<String> stack1 = new Stack<String>();
        stack1.push(brackets);
        System.out.println("Expected : " + stack1);

        // the stack which we check
        Stack<String> stack = new Stack<String>();
        stack.push(symbols);
        System.out.println("Current : " + stack);

        if (stack.equals(stack1) == true)
            System.out.println("comparing stacks: " + stack.equals(stack1));
        else{
            System.out.println("different stack of brackets: ");
            for (int i = 0; i< symbols.length(); i++){
                System.out.println(symbols.charAt(i));
            }

        }

    }

    public static void checkBrackets2(String symbols) {
        // the Stack to which we compare to
        String brackets = "[{()}]";
        Stack<String> cBracket = new Stack<String>();
        cBracket.push(brackets);
        System.out.println("Expected : " + cBracket);

        // the stack which we check
        Stack<String> cSymbol = new Stack<String>();
        cSymbol.push(symbols);
        System.out.println("Current : " + cSymbol);

        for(int i = 0; i < cBracket.toString().length(); i++){
            if(cBracket.toString().charAt(i) != cSymbol.toString().charAt(i)){
                System.out.println("not comparatable symbol: " + cSymbol.toString().charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("------OLD METHOD-----");
       checkBrackets("[[]{}()]");
        System.out.println("---------------------");
        System.out.println("------NEW METHOD-----");
       checkBrackets2("[[]{}()]");
        System.out.println("---------------------");
    }



}
