package com.hh.baekjoon;

import java.util.Scanner;

public class String09 {
	//백준 2941번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = sc.next();
		int answer = 0;
		
		for(int i = 0; i<alphabets.length; i++) {
			if(word.contains(alphabets[i])) {
				word = word.replace(alphabets[i], "0");
			}
		}
		answer = word.length();
		System.out.println(answer);
		
	}
}
