package com.hh.thisiscoding;

import java.util.Scanner;

public class Q805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int index = 0;
		
		while(input > 1) {
			if(input % 5 == 0) {
				input /= 5;
				index++;
			}else if(input % 3 == 0) {
				input /= 3;
				index++;
			}else if(input % 2 == 0) {
				input /= 2;
				index++;
			}else {
				input -= 1;
				index++;
			}
		}
		
		System.out.println(index);
	}
}
