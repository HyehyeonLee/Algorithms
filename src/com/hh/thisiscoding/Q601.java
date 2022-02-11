package com.hh.thisiscoding;

public class Q601 {

	public static void main(String[] args) {
		int[] array = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i = 0; i<array.length; i++) {
			int minIndex = i;
			for(int j = i+1; j<array.length; j++) {
				if(array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			int tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
