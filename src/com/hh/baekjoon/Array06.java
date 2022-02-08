package com.hh.baekjoon;

import java.util.Scanner;

public class Array06 {
	//백준 8958번
	public static int solution(String s) {
		int answer = 0;
		String[] str = s.split("");
		int idx = 1;
		
		for(int i = 0; i<str.length; i++) {
			if(str[i].equals("O")) {
				answer += (1 * idx);
				idx++;
			}else if(str[i].equals("X")) {
				idx = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			String s = sc.next();
			System.out.println(solution(s));
		}
	}

}
