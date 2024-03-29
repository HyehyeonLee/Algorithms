package com.hh.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Kst {
	//K번째수
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i<commands.length; i++) {
        	int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2] -1];
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
		Kst sol = new Kst();
		int[] array = {};
		int[][] commands = {{2,5,3},
							{4,4,1},
							{1,7,3}};
	}

}
