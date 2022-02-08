package com.hh.programmers;

public class NegaPosi {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i<absolutes.length; i++) {
        	if(signs[i]) {
        		answer += absolutes[i];
        	}else {
        		answer -= absolutes[i];
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		NegaPosi sol = new NegaPosi();
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		System.out.println(sol.solution(absolutes, signs));
	}
}
