package com.hh.baekjoon.impl;

import java.util.Scanner;

public class PrintStar4 {
	// 백준 2441번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = n-i; k > 0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
