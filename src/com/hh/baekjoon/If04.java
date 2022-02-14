package com.hh.baekjoon;

import java.util.Scanner;

public class If04 {
	//백준 14681번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int quad = 0;
		
		if(0 < x && 0 < y) {
			quad = 1;
		}else if(x < 0 && 0 < y) {
			quad = 2;
		}else if(x < 0 && y < 0) {
			quad = 3;
		}else if(0 < x && y < 0) {
			quad = 4;
		}
		System.out.println(quad);
		sc.close();
	}
}
