package com.hh.review;

public class Question2 {
	public int solution(String s) {
		int answer = 0;
		
		while(s.length() > 0) {
			if(s.contains("01")) {
				s = s.replace("01", "");
			}else if(s.contains("10")) {
				s = s.replace("10", "");
			}else {
				answer = s.length();
				break;
			}
			
			answer = s.length();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Question2 sol = new Question2();
		String s = "111000";
		long start = System.currentTimeMillis();
		System.out.println(sol.solution(s));
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start)/1000.0);
	}
}
