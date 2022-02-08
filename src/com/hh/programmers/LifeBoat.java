package com.hh.programmers;

import java.util.Arrays;

public class LifeBoat {
	public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int min = 0;
        
        for(int max = people.length-1; min<=max; max--) {
        	if(people[min] + people[max] <= limit) {
        		min++;
        		answer++;
        	}
        }
        return answer;
        
    }
	
	public static void main(String[] args) {
		int[] people = {80,70,50,50};
		int limit = 100;
		LifeBoat sol = new LifeBoat();
		System.out.println(sol.solution(people, limit));
		
	}
}
