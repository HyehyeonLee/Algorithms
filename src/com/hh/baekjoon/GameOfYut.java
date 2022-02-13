package com.hh.baekjoon;

import java.util.Scanner;

public class GameOfYut {
	//백준 2490번
	public static String solution(String s) {
		String answer = "";
		s = s.replace(" ", "");
		String[] yut = {"E", "A", "B", "C", "D"};
		int idx = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == '0') {
				idx++;
			}
		}
		
		answer = yut[idx];
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			String input = sc.nextLine();
			System.out.println(solution(input));
		}
		sc.close();
	}
}
