package com.hh.programLecture;

import java.util.Arrays;

public class Permutation {
	public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != i){
                answer = false;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		
	}

}
