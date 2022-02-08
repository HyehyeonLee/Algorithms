package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Array04 {
	//백준 3052번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] mod = new int[10];
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j<10; j++) {
			mod[j] = arr[j] % 42;
		}
		
		for(int m : mod) {
			if(!answer.contains(m)) {
				answer.add(m);
			}
		}
		
		System.out.println(answer.size());
	}

}
