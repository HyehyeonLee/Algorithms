package com.hh.baekjoon;

import java.util.Scanner;

public class Math101 {
	//백준 1712번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int answer = 0;
		
		if(c <= b) {
			answer = -1;
		}else {
			answer = a/(c-b)+1;
		}
		
		System.out.println(answer);
	}
}
