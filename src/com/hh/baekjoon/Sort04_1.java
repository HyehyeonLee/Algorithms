package com.hh.baekjoon;

import java.util.Scanner;

public class Sort04_1 {
	public static void descOrder(int[] arr) {
		int tmp;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		descOrder(arr);
		System.out.println(arr[k - 1]);
		sc.close();
	}
}
