package com.hh.programmers;

public class SquareRoot {
	//정수 제곱근 판별
	public long solution(long n) {
        long answer = 0;
        long root = (long) Math.sqrt(n);
        if(n == Math.pow(root, 2)) {
        	answer = (long) Math.pow(root+1, 2);
        }else {
        	answer = -1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		SquareRoot sol = new SquareRoot();
		long n = 3;
		//System.out.println(Math.sqrt(3));
		System.out.println(sol.solution(n));
	}
}
