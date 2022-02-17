package com.hh.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringSort {
	//문자열 내 마음대로 정렬하기
	public String[] solution(String[] strings, int n) {
		String[] answer;
		ArrayList<String> list = new ArrayList<String>();
		for (String str : strings) {
			list.add(str);
		}
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(n) < o2.charAt(n)) {
					return -1;
				} else if (o1.charAt(n) == o2.charAt(n)) {
					return o1.compareTo(o2);
				} else {
					return 1;
				}
			}

		});
		answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		StringSort sol = new StringSort();
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		String[] answer = sol.solution(strings, n);

		for (String a : answer) {
			System.out.print(a + " ");
		}
	}

}
