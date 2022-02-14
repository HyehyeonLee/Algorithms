package com.hh.baekjoon;

import java.util.Scanner;

public class Dyanamic101 {
	// 백준 1463번
	public static int d[] = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 2; i <= x; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0) {
				d[i] = Math.min(d[i], d[i / 2] + 1);
			}
			if (i % 3 == 0) {
				d[i] = Math.min(d[i], d[i / 3] + 1);
			}

		}
		
		System.out.println(d[x]);
	}
}
