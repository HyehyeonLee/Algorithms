package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Array02 {
	//백준 2562번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int maxIndex = 0;
		
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
				maxIndex = j;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex + 1);
		
	}
}
