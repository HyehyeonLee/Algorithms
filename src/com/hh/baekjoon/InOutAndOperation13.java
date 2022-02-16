package com.hh.baekjoon;

import java.util.Scanner;

public class InOutAndOperation13 {
	//백준 2588번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] num = String.valueOf(b).split("");
		
		System.out.println(a * Integer.parseInt(num[2]));
		System.out.println(a * Integer.parseInt(num[1]));
		System.out.println(a * Integer.parseInt(num[0]));
		System.out.println(a*b);
		
		sc.close();
	}

}
