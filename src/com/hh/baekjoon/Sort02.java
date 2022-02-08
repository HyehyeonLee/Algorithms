package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort02 {
	//백준 2751번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int num : list) {
			sb.append(num).append('\n');
		}
		
		System.out.println(sb);
	}
}
