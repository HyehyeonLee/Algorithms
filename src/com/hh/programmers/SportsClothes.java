package com.hh.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class SportsClothes {
	//체육복
	public int solution(int n, int[] lost, int[] reserve) {
        int answer =  n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
       
        for(int i = 0; i<lost.length; i++) {
        	for(int j = 0; j<reserve.length; j++) {
        		if(lost[i] == reserve[j]) {
        			answer++;
        			lost[i] = -1;
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
        
        for(int i = 0; i<lost.length; i++) {
        	for(int j = 0; j<reserve.length; j++) {
        		if(reserve[j] != -1 && lost[i] != -1) {
        			if(reserve[j] == lost[i]-1 || reserve[j] == lost[i]+1) {
        				answer++;
        				reserve[j] = -1;
        				break;
        			}
        		}
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		SportsClothes greedy = new SportsClothes();
		int n = 5;
		int lost[] = {2,4};
		int reserve[] = {1,3,5};
		
		System.out.println(greedy.solution(n, lost, reserve));
	}

}
