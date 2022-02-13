package com.hh.baekjoon;

import java.util.Scanner;

public class VerticalReading {
	//백준 10798번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String arr[][] = new String[5][15];
		String answer = "";
		char[][] arr = new char[5][15];
		
		for(int i = 0; i<arr.length; i++) {
			String str = sc.nextLine();
			for(int j = 0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i<15; i++) {
			for(int j = 0; j<5; j++) {
				char c = arr[j][i];
				if(c == ' ' || c == '\0') continue;
				answer += String.valueOf(c);
			}
		}
		
		System.out.println(answer);
	}
}
