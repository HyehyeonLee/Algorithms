package com.hh.baekjoon;

import java.util.Scanner;

public class BruteForce05 {
	//백준 1436번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int idx = 0;
		int series = 0;
		while(true) {
			idx++;
			if(String.valueOf(idx).contains("666")) {
				series++;
				if(series == n) {
					System.out.println(idx);
					break;
				}
			}
		}
		sc.close();
	}
}
