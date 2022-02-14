package com.hh.baekjoon;

import java.util.Scanner;

public class If05 {
	//백준 2884번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		m -= 45;
		
		if(m < 0) {
			h--;
			m += 60;
			if(h < 0) {
				h = 23;
			}
		}
		
		System.out.println(h + " " + m);
		
		sc.close();
	}
}
