package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sort08 {
	//백준 1181번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			String s = sc.next();
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) {
					return -1;
				}else if(o1.length() == o2.length()){
					return o1.compareTo(o2);
				}else {
					return 1;
				}
			}
			
		});
		
		for(String str : list) {
			System.out.println(str);
		}
		sc.close();
	}
}
