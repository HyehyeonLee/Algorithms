package com.hh.programmers;

public class StringBasic {
	public boolean solution(String s) {
        boolean answer = false;
        int n = 0;
        if(s.length() == 4 || s.length() == 6){
        	try {
        		n = Integer.parseInt(s);
        		answer = true;
        	}catch(NumberFormatException e) {
        		answer = false;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		StringBasic sol = new StringBasic();
//		String s = "a234";
		String s = "-14567";
		System.out.println(sol.solution(s));
	}
}
