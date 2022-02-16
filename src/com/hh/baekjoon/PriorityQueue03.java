package com.hh.baekjoon;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue03 {
	// 백준 11286번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) == Math.abs(o2)) {
					if(o1 < o2) {
						return -1;
					}else {
						return 1;
					}
				}
				return Math.abs(o1) - Math.abs(o2);
			}
		});

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();

			if (x == 0 && !q.isEmpty()) {
				System.out.println(q.poll());
			}else if(x == 0 && q.isEmpty()) {
				System.out.println(0);
			}else {
				q.add(x);
			}
		}

		sc.close();
	}

}
