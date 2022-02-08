package com.hh.baekjoon;

import java.util.Scanner;

public class String07 {
	//백준 2908번
	public static String solution(String num) {
		String answer = "";
		String head = num.substring(0, 1);
		String mid = num.substring(1, 2);
		String tail = num.substring(2, 3);
		answer = tail + mid + head;
		
		return answer;
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		
		int newNum1 = Integer.parseInt(solution(num1));
		int newNum2 = Integer.parseInt(solution(num2));
		
		if(newNum1 > newNum2) {
			System.out.println((newNum1));
		}else {
			System.out.println((newNum2));
		}
	}
}
