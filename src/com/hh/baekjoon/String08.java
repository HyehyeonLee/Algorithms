package com.hh.baekjoon;

import java.util.Scanner;

public class String08 {
	// 백준 5622번
	public static int solution(String str) {
		int answer = 0;
		String[] chars = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int[] nums = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };

		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			for (int j = 0; j < chars.length; j++) {
				if (s.equals(chars[j])) {
					answer += nums[j];
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int answer = solution(str);
		System.out.println(answer);
	}
}
