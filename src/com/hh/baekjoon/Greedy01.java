package com.hh.baekjoon;

import java.util.Scanner;

public class Greedy01 {
	//백준 11047번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int coin[] = new int[n];
		
		for(int i = 0; i<coin.length; i++) {
			coin[i] = sc.nextInt();
		}
		
		int result = 0;
		
		for(int i = n-1; i>=0; i--) {
			result += k / coin[i];
			k = k - (coin[i] * (k / coin[i]));
		}
		
		System.out.println(result);
	}

}
