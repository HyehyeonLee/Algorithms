package com.hh.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BasicMath104 {
	//백준 2869번
	public static void main(String[] args) throws IOException, NumberFormatException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int v = sc.nextInt();
		String input = br.readLine();
		String[] strs = input.split(" ");
		
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int v = Integer.parseInt(strs[2]);
		
		int day = (v - b) / (a - b);
		if((v - b) % (a - b) != 0) {
			day++;
		}
		
		bw.write(day + "\n");
		bw.flush();
	}

}
