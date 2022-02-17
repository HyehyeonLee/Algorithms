package com.hh.programmers;

public class CountPy {
	//문자열 내 p와 y의 개수
	boolean solution(String s) {
        boolean answer = false;
        char[] c = s.toCharArray();
        int p = 0;
        int y = 0;
        
        for(int i=0; i<c.length; i++) {
        	if(c[i] == 'P' || c[i] == 'p') {
        		p++;
        	}else if(c[i] == 'Y' || c[i] == 'y') {
        		y++;
        	}
        }
        
        if(p == y) {
        	answer = true;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		CountPy sol = new CountPy();
		String s = "Pyy";
		System.out.println(sol.solution(s));
	}
}
