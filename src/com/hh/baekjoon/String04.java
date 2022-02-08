package com.hh.baekjoon;

import java.util.Scanner;

public class String04 {
	//백준 2675번
	public static String strRepeat(int n, String str) {
		String answer = "";
		String[] arr = str.trim().split("");
		for(int i = 0; i<arr.length; i++) {
			answer += arr[i].repeat(n);
		}

		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int num = sc.nextInt();
			String str = sc.next();
			String answer = strRepeat(num, str);
			System.out.println(answer);
		}
	}
}
