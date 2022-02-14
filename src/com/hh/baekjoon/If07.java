package com.hh.baekjoon;

import java.util.Scanner;

public class If07 {
	//백준 2480번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int prize = 0;
		
		if(n1 == n2 && n2 == n3) {
			prize = 10000 + n1 * 1000;
		}else if(n1 == n2 || n1 == n3) {
			prize = 1000 + n1 * 100;
		}else if(n2 == n3) {
			prize = 1000 + n2 * 100;
		}else {
			prize = Math.max(Math.max(n1, n2), n3) * 100;
		}
		
		System.out.println(prize);
		sc.close();
	}

}
