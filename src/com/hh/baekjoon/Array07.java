package com.hh.baekjoon;

import java.util.Scanner;

public class Array07 {
	//백준 4344번
	public static void solution(int n, int[] arr) {
		int avg = 0;
		int sum = 0;
		double count = 0;
		
		for(int i = 0; i<n; i++) {
			sum += arr[i];
		}
		
		avg = sum / n;
		for(int j = 0; j<n; j++) {
			if(arr[j] > avg) {
				count++;
			}
		}
		double rate = count / n * 100;
		System.out.print(String.format("%.3f", rate));
		System.out.println("%");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i = 0; i<c; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int j = 0; j<n; j++) {
				arr[j] = sc.nextInt();
			}
			solution(n, arr);
		}
	}
}
