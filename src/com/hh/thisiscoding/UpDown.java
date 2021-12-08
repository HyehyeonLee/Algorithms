package com.hh.thisiscoding;

import java.util.Scanner;

public class UpDown {
	public int[] sort(int arr[]) {
		
		for(int i = 0; i<arr.length; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		UpDown ud = new UpDown();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] sortArr = ud.sort(arr);
		
		for(int i = 0; i<sortArr.length; i++) {
			System.out.print(sortArr[i] +", ");
		}
	}
}
