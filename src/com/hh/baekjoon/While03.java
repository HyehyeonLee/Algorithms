package com.hh.baekjoon;

import java.util.Scanner;

public class While03 {
	//백준 1110
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = input;
		
		int cycle = 0;
		int ten = 0;
		int one = 0;
		
		
		while(true) {
			ten = (input % 10);
			one = (input / 10) + (input % 10);
			input = (ten * 10) + (one % 10);
			cycle++;
			if(input == output) {
				System.out.println(cycle);
				break;
			}
		}

	}

}
