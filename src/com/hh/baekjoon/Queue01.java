package com.hh.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
	// 백준 18258번
	public static void main(String[] args) throws IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int back = 0;
		for(int i = 0; i<n; i++) {
			String input = br.readLine();
			String[] cmd = input.split(" ");
			switch (cmd[0]) {
			case "push":
				q.add(Integer.parseInt(cmd[1]));
				back = Integer.parseInt(cmd[1]);
				break;
			case "pop":
				if(q.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(q.poll() + "\n");
				}
				break;
			case "size":
				bw.write(q.size() + "\n");
				break;
			case "empty":
				if(q.isEmpty()) {
					bw.write("1" + "\n");
				}else {
					bw.write("0" + "\n");
				}
				break;
			case "front":
				if(q.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(q.peek() + "\n");
				}
				break;
			case "back":
				if(q.isEmpty()) {
					bw.write("-1" + "\n");
				}else {
					bw.write(back + "\n");
				}
				break;

			}
		}

		bw.flush();
		bw.close();
	}

}
