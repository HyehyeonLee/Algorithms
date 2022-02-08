package com.hh.baekjoon;

import java.util.Scanner;

public class For07 {
	//백준 11021번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i<=t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("Case #" + i + ": ");
			System.out.println(a+b);
		}
	}
}
