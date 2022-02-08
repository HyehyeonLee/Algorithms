package com.hh.baekjoon;

import java.util.Scanner;

public class For01 {
	//백준 2739번
    public static void printGugudan(int dan) {
        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan;
        while(true) {
            dan = sc.nextInt();
            if(dan >= 1 && dan <= 9) {
                break;
            }else {
                System.out.println("다시 입력해주세요");
            }
        }
        printGugudan(dan);
    }
}
