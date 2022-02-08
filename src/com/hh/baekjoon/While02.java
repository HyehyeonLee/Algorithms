package com.hh.baekjoon;

import java.util.Scanner;

public class While02 {
	//백준 10951
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int sum = 0;
		
		while(sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			
			System.out.println(sum);
			
		}
		
	}

}
