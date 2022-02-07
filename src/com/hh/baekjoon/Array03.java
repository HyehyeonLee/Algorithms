package com.hh.baekjoon;

import java.util.Scanner;

public class Array03 {
	//백준 2577번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String mul = String.valueOf(a * b * c);
		String strs[] = mul.split("");
		
		for(int i = 0; i<strs.length; i++) {
			int index = Integer.parseInt(strs[i]);
			arr[index]++;
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
	}
}
