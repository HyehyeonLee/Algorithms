package com.hh.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack02 {
	//백준 10773번
	public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int item = sc.nextInt();
            if(item == 0){
                s.pop();
            }else{
                s.push(item);
            }
        }

        int total = 0;
        
        for(int num : s){
            total += num;
        }

        System.out.println(total);
    }
}
