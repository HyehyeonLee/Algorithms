package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce01 {
	// 백준 2798번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		int total = 0;
		int max = 0;
		for (int x = 0; x < list.size() - 2; x++) {
			for (int y = x + 1; y < list.size() - 1; y++) {
				for (int z = y + 1; z < list.size(); z++) {
					total = list.get(x) + list.get(y) + list.get(z);
					if (total == m) {
						System.out.println(total);
						return;
					}
					if(total < m) {
						max = Math.max(max, total);
					}
				}
			}
		}

		System.out.println(max);
		sc.close();
	}
}
