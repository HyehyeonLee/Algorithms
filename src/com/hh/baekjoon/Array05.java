package com.hh.baekjoon;

import java.util.Scanner;

public class Array05 {
	//백준 1546번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int max = 0;
		int score = 0;
		
		for(int i = 0; i<n; i++) {
			score = sc.nextInt();
			sum += score;
			if(score > max) {
				max = score;
			}
		}
		
		double avg = 0;
		avg = 100.0 * sum / max / n;
		System.out.println(avg);
	}
}
