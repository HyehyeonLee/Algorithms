package com.hh.baekjoon;

import java.util.Scanner;

public class FindSecInteger {
	//백준 10817번
	public static boolean rightNum(int num) {
		if(num >= 1 && num <= 100) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int mid = 0;
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(rightNum(a) && rightNum(b) && rightNum(c)) {
				break;
			}else {
				System.out.println("1이상, 100이하의 숫자만 입력해주세요");
			}
		}
		
		if(a >= b) {
			if(b >= c) {
				mid = b;
			}else if(c >= a) {
				mid = a;
			}else {
				mid = c;
			}
		}else if(b >= a) {
			if(a >= c) {
				mid = a;
			}else if(c >= b) {
				mid = b;
			}else {
				mid = c;
			}
		}
		
		System.out.println(mid);
	}
}
