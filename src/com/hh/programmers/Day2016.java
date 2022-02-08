package com.hh.programmers;

import java.util.HashMap;

public class Day2016 {
	public String solution(int a, int b) {
        String answer = "";
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 6);
        map.put(2, 2);
        map.put(3, 2);
        map.put(4, 5);
        map.put(5, 0);
        map.put(6, 3);
        map.put(7, 5);
        map.put(8, 1);
        map.put(9, 4);
        map.put(10, 6);
        map.put(11, 2);
        map.put(12, 4);
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int value = map.get(a);
        int sum = 6 + value + b;
        int mod = sum % 7;
        
        
        answer = day[mod];
        return answer;
    }
	
	public static void main(String[] args) {
		Day2016 sol = new Day2016();
		int a = 5;
		int b = 24;
		System.out.println(sol.solution(a, b));
	}
}
