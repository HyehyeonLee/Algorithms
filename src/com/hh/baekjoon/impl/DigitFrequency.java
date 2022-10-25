package com.hh.baekjoon.impl;

import java.util.Scanner;

public class DigitFrequency {
	// 백준 14912번 => 시간초과
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		String str = "";
		for (int i = 1; i <= n; i++) {
			str += String.valueOf(i);
		}
		
		int frequency = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(String.valueOf(d))) {
				frequency++;
			}
		}

		System.out.println(frequency);
	}

}
