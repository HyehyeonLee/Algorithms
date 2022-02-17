package com.hh.programmers;

import java.util.Arrays;

public class Budget {
	//예산
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i<d.length; i++) {
        	if(budget >= d[i]) {
        		budget -= d[i];
        		answer++;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Budget sol = new Budget();
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(sol.solution(d, budget));
	}
}
