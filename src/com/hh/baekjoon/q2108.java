package com.hh.baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q2108 {
	//풀다 맒 -> 최빈값 구해야함
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static int mode(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int m = 0;
		int v = 1;
		for(int i = 0; i<arr.length; i++) {
			map.put(arr[i], v);
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					map.replace(arr[i], v++);
				}
			}
		}
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sort(arr);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println(Math.round(sum / n));
		int mid = Math.round((arr.length - 1) / 2);
		System.out.println(arr[mid]);

		System.out.println(arr[arr.length - 1] - arr[0]);

	}
}
