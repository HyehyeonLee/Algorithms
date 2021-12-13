package com.hh.programmers;

public class Collatz {
	public int solution(int num) {
        int answer = 0;
        double dnum = num;
        
        while(dnum != 1) {
        	if(dnum % 2 == 0) {
        		dnum = dnum / 2;
        	}else {
        		dnum = (dnum * 3) + 1;
        	}
        	
        	answer++;
        	
        	if(answer == 500) {
        		answer = -1;
        		break;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		int num = 626331;
		Collatz sol = new Collatz();
		System.out.println(sol.solution(num));
	}

}
