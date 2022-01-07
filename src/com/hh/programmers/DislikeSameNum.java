package com.hh.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DislikeSameNum {
	public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();        
        int temp = arr[0];
        list.add(temp);
        
        for(int i = 1; i<arr.length; i++) {
        	if(temp != arr[i]) {
        		list.add(arr[i]);
        		temp = arr[i];
        	}
        }
       
       answer = new int[list.size()];
       for(int j = 0; j <list.size(); j++) {
    	   answer[j] = list.get(j);
       }
       return answer;
    }
	
	public static void main(String[] args) {
		DislikeSameNum sol = new DislikeSameNum();
		int arr[] = {1,1,3,3,0,1,1};
		
		int answer[] = sol.solution(arr);
		for(int i : answer) {
			System.out.print(i + " ");
		}
	}
}
