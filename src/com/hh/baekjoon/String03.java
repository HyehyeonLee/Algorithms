package com.hh.baekjoon;

import java.util.Scanner;

public class String03 {
	//백준 10809번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", 
				"v", "w", "x", "y", "z"};
		
		for(int i = 0; i<arr.length; i++) {
			if(s.contains(arr[i])) {
				System.out.print(s.indexOf(arr[i]) + " ");
			}else {
				System.out.print("-1 ");
			}
		}
	}
}
