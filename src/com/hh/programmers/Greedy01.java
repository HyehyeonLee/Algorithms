package com.hh.programmers;

import java.util.Scanner;

public class Greedy01 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;
       
        for(int i = 0; i<lost.length; i++) {
        	if(answer == n) break;
        	for(int j = 0; j<reserve.length; j++) {
        		if(reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
        			reserve[j] = 0;
        			answer++;
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Greedy01 greedy = new Greedy01();
		int n = 3;
		int lost[] = {3};
		int reserve[] = {1};
		
		System.out.println(greedy.solution(n, lost, reserve));
	}

}
