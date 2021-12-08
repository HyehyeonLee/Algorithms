package com.hh.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i<p.length; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		
		int sum = 0;
		int total = 0;
		
		for(int i = 0; i<p.length; i++) {
			total += sum + p[i];
			sum += p[i];
		}
		
		System.out.println(total);
	}
}
