package com.hh.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack01 {
	//백준 10828번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int n = sc.nextInt();

        for(int i = 0; i<=n; i++){
            String cmd = sc.nextLine();
            if(cmd.contains("push")){
                cmd = cmd.replace("push ", "");
                stack.push(Integer.parseInt(cmd));
            }else if(cmd.equals("pop")){
            	System.out.println(stack.isEmpty()?-1:stack.pop());
            }else if(cmd.equals("size")){
            	System.out.println(stack.size());
            }else if(cmd.equals("empty")){
            	System.out.println(stack.isEmpty()?1:0);
            }else if(cmd.equals("top")){
            	System.out.println(stack.isEmpty()?-1:stack.peek());
            }
        }
        
        sc.close();
    }
}
