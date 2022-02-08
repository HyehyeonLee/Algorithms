package com.hh.baekjoon;

import java.util.Scanner;

public class q10950 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		t = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
		}
		
	}
}

