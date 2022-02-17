package com.hh.programmers;

public class WaterMelon {
	//수박수박수박수박수박수박수?
	public String solution(int n) {
        char[] answer = new char[n];
        
        for(int i = 0; i<n; i++) {
        	answer[i] = (i % 2 == 1) ? '박' : '수';
        }
        
        return String.valueOf(answer);
    }

	public static void main(String[] args) {
		WaterMelon sol = new WaterMelon();
		int n = 3;
		System.out.println(sol.solution(n));
	}

}
