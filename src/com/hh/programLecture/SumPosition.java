package com.hh.programLecture;

public class SumPosition {
	public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        for(String s : arr) {
        	answer += Integer.parseInt(s);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 123;
		SumPosition sol = new SumPosition();
		System.out.println(sol.solution(n));
	}
}
