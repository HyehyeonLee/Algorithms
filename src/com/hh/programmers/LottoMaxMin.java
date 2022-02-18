package com.hh.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class LottoMaxMin {
	// 로또의 최고 순위와 최저 순위
	// 정확성: 80.0
	// 합계: 80.0 / 100.0
	
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		
		int[] rank = { 6, 6, 5, 4, 3, 2, 1 };
		int zeroCount = 0;
		int minIdx = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zeroCount++;
			}

			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					minIdx++;
					win_nums[j] = 99;
				}
			}
		}
		
		int remWinNum = 0;
		for(int i = 0; i<win_nums.length; i++) {
			if(win_nums[i] == 99) {
				remWinNum++;
			}
		}
		
		remWinNum = win_nums.length - remWinNum;
		maxIdx = minIdx;
		
		if(zeroCount > remWinNum) {
			maxIdx += remWinNum;
		}else if(zeroCount < remWinNum){
			maxIdx += zeroCount;
		}else if(zeroCount == 6) {
			maxIdx = zeroCount;
		}

		answer[0] = rank[maxIdx];
		answer[1] = rank[minIdx];
		
		return answer;
	}

	public static void main(String[] args) {
		LottoMaxMin sol = new LottoMaxMin();
		int[] lottos = { 0, 0, 0, 0, 0, 0 };
		int[] win_nums = { 38, 19, 20, 40, 15, 25 };
		int[] answer = sol.solution(lottos, win_nums);
		for(int a : answer) {
			System.out.print(a + " ");
		}
	}

}
