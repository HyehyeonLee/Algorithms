package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Sort04 {
	//백준 2108번
	public static int getAvg(ArrayList<Integer> list) {
		int answer = 0;
		double sum = 0;
		for (int i : list) {
			sum += i;
		}
		double avg = sum / list.size();
		if (avg < 0) {
			answer = (int) Math.round(Math.abs(avg) * -1);
		} else {
			answer = (int) Math.round(avg);
		}
		return answer;
	}

	public static int getMode(ArrayList<Integer> list) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < list.size(); i++) {
			int key = list.get(i);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		int maxValue = 0;
		for (int value : map.values()) {
			maxValue = Math.max(maxValue, value);
		}

		list.clear();
		for (int key : map.keySet()) {
			if (map.get(key) == maxValue) {
				list.add(key);
			}
		}

		Collections.sort(list);

		if (list.size() >= 2) {
			answer = list.get(1);
		} else {
			answer = list.get(0);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		if(max < 0 && min < 0) {
			min = Math.abs(min);
		}else if(max > 0 && min > 0) {
			min = min * (-1);
		}else {
			max = Math.abs(max);
			min = Math.abs(min);
		}
		
		
		int average = getAvg(list);
		int mid = list.get(list.size() / 2);
		int mode = getMode(list);
		int range = max + min;

		System.out.println(average);
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(range);

	}
}
