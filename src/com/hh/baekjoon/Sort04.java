package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list.get(k - 1));
		sc.close();
	}

}
