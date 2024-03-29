package com.hh.baekjoon;

import java.util.Scanner;

public class Recursive02 {
	//백준 10870번
	public static int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibo(n));
	}
}
