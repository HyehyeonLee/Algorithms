package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class String10 {
	//백준 1316번
	public static boolean isGroupWord(String str) {
		boolean flag = true;
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(str.substring(0,1));
		
		for(int i = 1; i<str.length(); i++) {
			String s = str.substring(i, i+1);
			if(!s.equals(list.get(list.size()-1))) {
				list.add(s);
			}
		}
		
		for(int i = 0; i<list.size(); i++) {
			for(int j = i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					flag = false;
				}
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int wordNum = 0;
		
		for(int i = 0; i<n; i++) {
			String str = sc.next();
			if(isGroupWord(str)) {
				wordNum++;
			}
		}
		
		System.out.println(wordNum);
	}
}
