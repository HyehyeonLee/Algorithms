package com.hh.review;

public class Question1 {
	public int[] solution(int[][] v) {
        int[] answer = new int[2];

        for(int i = 0; i<v.length; i++) {
        	answer[0] ^= v[i][0];
        	answer[1] ^= v[i][1];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Question1 sol = new Question1();
		int[][] v = {{1,4},{3,4},{3,10}};
		//00 01
		//10 11
		//20 21
		System.out.println(sol.solution(v));
	}
}
