package com.hh.programmers;

public class SumNegaPosi {
	//음양 더하기
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
		SumNegaPosi sol = new SumNegaPosi();
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		System.out.println(sol.solution(absolutes, signs));
	}
}
