package com.hh.baekjoon;

import java.util.Scanner;

public class BasicMath105 {
	//백준 10250번
	public static int acmHotel(int h, int w, int n) {
		int answer = 0;
		int getH = n % h;
		int getW = n / h + 1;
		if(n % h == 0) {
			getH = h;
			getW = n / h;
		}
		answer = getH * 100 + getW;
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int answer = acmHotel(h, w, n);
			System.out.println(answer);
		}
	}
}
