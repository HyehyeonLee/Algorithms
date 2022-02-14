package com.hh.baekjoon;

import java.util.Scanner;

public class If06 {
	//백준 2525번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String now = sc.nextLine();
		String[] nowTime = now.split(" ");
		int hour = Integer.parseInt(nowTime[0]);
		int min = Integer.parseInt(nowTime[1]);
		
		int plusMin = sc.nextInt();
		
		min = min + plusMin;
		
		if(min >= 60) {
			hour += (min / 60);
			min -= (min / 60) * 60;
		}
		
		if(hour >= 24) {
			hour -= 24;
		}
		
		System.out.println(hour + " " + min);
		sc.close();
	}

}
