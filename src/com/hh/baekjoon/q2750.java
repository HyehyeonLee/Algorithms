package com.hh.baekjoon;

import java.util.Scanner;

public class q2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i<arr.length; i++) {
			int maxIndex = i;
			for(int j = 0; j<i; j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
