package com.hh.baekjoon;

import java.util.Scanner;

public class FindMaxMin {
	//백준 10818번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int list[] = new int[size];
		
		for (int i = 0; i < list.length; i++) {
			int input = sc.nextInt();
			list[i] = input;
		}
		
		int min = list[0];
		int max = list[0];
		
		for(int i = 0; i < list.length; i++) {
			if(min >= list[i]) {
				min = list[i];
			}
			
			if(max <= list[i]) {
				max = list[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}
