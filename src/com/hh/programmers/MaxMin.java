package com.hh.programmers;

import java.util.Arrays;

public class MaxMin {
	//최댓값과 최솟값
	public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");
        int[] ints = new int[strs.length];
        
        for(int i = 0; i<ints.length; i++) {
        	ints[i] = Integer.parseInt(strs[i]);
        }
        
        Arrays.sort(ints);
        answer = ints[0] + " " + ints[ints.length-1];
        return answer;
    }

	public static void main(String[] args) {
		MaxMin sol = new MaxMin();
		System.out.println(sol.solution("-1 -2 -3 -4"));
	}

}
