package com.hh.programmers;

import java.util.ArrayList;

public class RemoveMin {

	public int[] solution(int[] arr) {
		int[] answer = {};
		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		} else {

			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i : arr) {
				list.add(i);
			}

			int minIndex = 0;
			int min = list.get(0);

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) < min) {
					min = list.get(i);
					minIndex = i;
				}
			}

			list.remove(minIndex);

			answer = new int[arr.length - 1];
			for (int i = 0; i < answer.length; i++) {
				answer[i] += list.get(i);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 4,3,2,1 };
		RemoveMin sol = new RemoveMin();
		int[] answer = sol.solution(arr);
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}
