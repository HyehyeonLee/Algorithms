package com.hh.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
//1057번
public class Tournament {
	public int solution(int n, int a, int b) {
		int answer = 0;
		
		while(a != b) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			System.out.println(answer + " : " + a + " " + b);
			answer++;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Tournament sol = new Tournament();
		int n = 8;
		int a = 4;
		int b = 7;
		System.out.println(sol.solution(n, a, b));
	}

}
