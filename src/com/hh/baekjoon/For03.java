package com.hh.baekjoon;

import java.util.Scanner;

public class For03 {
	//8393번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n*(n+1)/2;
		System.out.println(sum);
	}
}
