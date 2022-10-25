package com.hh.baekjoon.impl;

import java.util.Scanner;

public class TenEnterPrint {
	//백준 11721번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
//		str = " " + str;
//		
//		for(int i = 0; i<str.length(); i++) {
//			if(i == 0) continue;
//			System.out.print(str.charAt(i));
//			if(i % 10 == 0) {
//				System.out.println();
//			}
//		}
		
		for(int i = 0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		sc.close();
	}

}
