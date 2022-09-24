package com.hh.baekjoon;

import java.util.Scanner;

public class InOutAndOperation10 {

	public static void main(String[] args) {
		int set[] = { 1, 1, 2, 2, 2, 8 };
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<set.length; i++) {
			int n = sc.nextInt();
			System.out.print(set[i] - n + " ");
		}
		
		sc.close();
	}

}
