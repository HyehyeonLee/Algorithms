package com.hh.thisiscoding;

public class Q603 {
	public static void main(String[] args) {
		int[] arr = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i = 1; i<arr.length; i++) {
			for(int j = i; j>0; j--){
				if(arr[j] < arr[j-1]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}else {
					break;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}
