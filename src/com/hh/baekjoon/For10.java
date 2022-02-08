package com.hh.baekjoon;

import java.util.Scanner;

public class For10 {
	//백준 2439번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		String blank;
//		
//		for(int i = n-1; i>=0; i--) {
//			blank = new String(new char[i]).replace("\0", " ");
//			System.out.print(blank);
//			for(int j = 0; j<n-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
