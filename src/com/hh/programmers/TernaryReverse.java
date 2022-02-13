package com.hh.programmers;

public class TernaryReverse {
	public int solution(int n) {
        int answer = 0;
        String ans = "";
        
        while(n != 0) {
        	ans += n%3;
        	n /= 3;
        }
        System.out.println(ans);
        answer = Integer.parseInt(ans, 3);
        return answer;
    }
	
	public static void main(String[] args) {
		TernaryReverse sol = new TernaryReverse();
		int n = 45;
		System.out.println(sol.solution(n));
	}
}
