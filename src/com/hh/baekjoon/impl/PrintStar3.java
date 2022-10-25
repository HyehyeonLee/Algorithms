package com.hh.baekjoon.impl;

import java.util.Scanner;

public class PrintStar3 {
	//백준 2240번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = n; i>=0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
