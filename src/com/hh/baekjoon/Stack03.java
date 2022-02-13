package com.hh.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack03 {
	//백준 9012번
	public static boolean isVps(String str) {
		Stack<String> stack = new Stack<String>();
		String strs[] = str.split("");
		int idx = 0;
		boolean flag = false;
		
		for(int i = 0; i<strs.length; i++) {
			if(strs[i].equals("(")) {
				stack.push("(");
				
			}else if(strs[i].equals(")")) {
				if(stack.isEmpty()) {
					idx++;
					flag = false;
					break;
				}else {
					stack.pop();
				}
				
			}
		}
		
		if(stack.isEmpty() && idx == 0) {
			flag = true;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			String str = sc.next();
			if(isVps(str)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
