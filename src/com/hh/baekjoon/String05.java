package com.hh.baekjoon;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;

public class String05 {
	//백준 1157번
	public static String solution(String str) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i<str.length(); i++) {
			String key = str.substring(i, i+1);
			int value = 1;
			if(map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			}else {
				map.put(key, value);			
			}
		}
		
		int maxValue = Collections.max(map.values());
		int index = 0;
		
		for(Entry<String, Integer> set : map.entrySet()) {
			if(set.getValue() == maxValue) {
				index++;
				answer = set.getKey();
			}
		}
		
		if(index >= 2) {
			answer = "?";
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		String answer = solution(str);
		System.out.println(answer);
		
	}
}
