package com.hh.programmers;

import java.util.ArrayList;

public class SumNotInNum {
	public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
       for(int n : numbers) {
    	   arr.add(n);
       }

        for(int i = 0; i<10; i++) {
        	if(!arr.contains(i)) {
        		answer += i;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		SumNotInNum sol = new SumNotInNum();
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(sol.solution(numbers));
	}
}
