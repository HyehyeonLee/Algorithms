package com.hh.baekjoon;

import java.util.Scanner;

public class String02 {
	//11720번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i<str.length(); i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
			//System.out.println(sum);
		}
		
		System.out.println(sum);
	}
}
