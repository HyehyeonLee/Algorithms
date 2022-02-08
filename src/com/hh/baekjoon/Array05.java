package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array05 {
	//백준 1546번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
		for(int i = 0; i<n; i++) {
			double num = sc.nextInt();
			list.add(num);
		}
		
		double max = Collections.max(list);
		
		for(int j = 0; j<list.size(); j++) {
			list.set(j, list.get(j) / max * 100);
		}
		
		double sum = 0;
		for(double score : list) {
			sum += score;
		}
		
		System.out.println(sum / n);
	}
}
