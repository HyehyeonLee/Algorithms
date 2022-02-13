package com.hh.baekjoon;

import java.io.*;
import java.util.Stack;

public class Stack01 {
	//백준 10828번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
			case "push":
				stack.push(Integer.parseInt(cmd[1]));
				break;
			case "pop":
				if(stack.isEmpty()){
					bw.write("-1" + "\n");
				}else{
					bw.write(stack.pop() + "\n");
				}
				break;
			case "size":
				bw.write(stack.size() + "\n");
				break;
			case "empty":
				if(stack.isEmpty()){
                    bw.write("1" + "\n");
                }else{
                    bw.write("0" + "\n");
                }
				break;
			case "top":
				if(stack.isEmpty()){
					bw.write("-1" + "\n");
				}else{
					bw.write(stack.peek() + "\n");
				}
				break;

			}

        }
        bw.flush();
        bw.close();

    }
}
