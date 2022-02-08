package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class For11 {
	//백준 10871번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		for(int j = 0; j<list.size(); j++) {
			if(list.get(j) < x) {
				System.out.print(list.get(j) + " ");
			}
		}
	}
}
