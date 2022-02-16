package com.hh.baekjoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue01 {
	//백준 11279번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			
			if(x > 0) {
				q.add(x);
			}else {
				if(q.isEmpty()) {
					System.out.println("0");
				}else {
					System.out.println(q.poll());
				}
			}
		}
		sc.close();
	}

}
