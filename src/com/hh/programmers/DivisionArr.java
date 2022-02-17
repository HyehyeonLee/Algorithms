package com.hh.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisionArr {
	//나누어 떨어지는 숫자 배열
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        
        if(list.isEmpty()) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[list.size()];
        	for(int i = 0; i<answer.length; i++) {
        		answer[i] += list.get(i);
        	}
        	Arrays.sort(answer);;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {3,2,6};
		int divisor = 10;
		DivisionArr sol = new DivisionArr();
		int[] answer = sol.solution(arr, divisor);
		
		for(int i : answer) {
			System.out.print(i + ", ");
		}
	}
}
