package com.hh.thisiscoding;

import java.util.Scanner;

public class Q402 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i<h+1; i++) {
			for(int j = 0; j<60; j++) {
				for(int k = 0; k<60; k++) {
					String str = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
					if(str.contains("3")) {
						count++;
					}
				}
			}
		}
		
		
		System.out.println(count);
	}
	

}
