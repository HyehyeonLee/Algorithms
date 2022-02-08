package com.hh.baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort05 {
	//백준 1427번
	public static void solution(int n) {
		String s = String.valueOf(n);
		String[] strs = s.split("");
		Arrays.sort(strs, Collections.reverseOrder());
		
		for(String i : strs) {
			System.out.print(i);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n);
	}
}
