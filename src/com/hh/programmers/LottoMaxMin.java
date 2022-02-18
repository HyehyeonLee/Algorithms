package com.hh.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class LottoMaxMin {
	// 로또의 최고 순위와 최저 순위
	//정확성: 46.7
	//합계: 46.7 / 100.0
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		ArrayList<Integer> winList = new ArrayList<Integer>();
		for(int i = 0; i<lottos.length; i++) {
			lottoList.add(lottos[i]);
			winList.add(win_nums[i]);
		}
		
		Collections.sort(lottoList);
		Collections.sort(winList);
		
		int[] rank = { 6, 6, 5, 4, 3, 2, 1 };
		int zeroCount = 0;
		int minIdx = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < lottoList.size(); i++) {
			if (lottoList.get(i) == 0) {
				zeroCount++;
			}

			for (int j = 0; j < winList.size(); j++) {
				if (lottoList.get(i) == winList.get(j)) {
					minIdx++;
					winList.remove(i);
				}
			}
		}
		
		if(zeroCount > winList.size()) {
			maxIdx = minIdx + winList.size();
		}else if(zeroCount < winList.size()){
			maxIdx = minIdx + zeroCount;
		}else {
			maxIdx = minIdx;
		}

		answer[0] = rank[maxIdx];
		answer[1] = rank[minIdx];
		
		return answer;
	}

	public static void main(String[] args) {
		LottoMaxMin sol = new LottoMaxMin();
		int[] lottos = { 45, 4, 35, 20, 3, 9 };
		int[] win_nums = { 20, 9, 3, 45, 4, 35 };
		int[] answer = sol.solution(lottos, win_nums);
		for(int a : answer) {
			System.out.print(a + " ");
		}
	}

}
