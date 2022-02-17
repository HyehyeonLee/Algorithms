package com.hh.programmers;

import java.util.*;

public class SumPosition {
	//자릿수 더하기
	public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        
        for(int i = 0; i<arr.length; i++) {
        	answer += Character.getNumericValue(arr[i]);
        }

        return answer;
    }
	public static void main(String[] args) {
		int n = 123;
		SumPosition sol = new SumPosition();
		System.out.println(sol.solution(n));
	}
}
