package com.hh.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class For04 {
	//백준 15552번
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i<n; i++) {
			String input = br.readLine().trim();
			String[] arr = input.split(" ");
			bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
		}
		bw.flush();
	}

}
