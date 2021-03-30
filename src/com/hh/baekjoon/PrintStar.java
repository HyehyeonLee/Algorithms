package com.hh.baekjoon;
import java.util.Scanner;

public class PrintStar {
    //백준 2523번
    public static boolean rightNum(int num) {
        if(num >= 1 && num <= 100) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true) {
            num = sc.nextInt();

            if(rightNum(num)) {
                break;
            }else {
                System.out.println("1이상, 100이하의 숫자만 입력해주세요");
            }
        }

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num-1; i >=1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
