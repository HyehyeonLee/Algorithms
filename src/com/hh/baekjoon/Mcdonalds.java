package com.hh.baekjoon;

import java.util.Scanner;

public class Mcdonalds {
	//백준 5543번
	public static boolean judgePrice(int price) {
		if(price >= 100 && price <= 2000) {
			return true;
		}
		return false;
	}
	
	public static int minBurger(int burger1, int burger2, int burger3) {
		int min = 0;
		if(burger1 < burger2 && burger1 < burger3) {
			min = burger1;
		}else if(burger2 < burger1 && burger2 < burger3) {
			min = burger2;
		}else {
			min = burger3;
		}
		
		return min;
	}
	
	public static int minDrink(int coke, int cider) {
		int min = 0;
		if(coke < cider) {
			min = coke;
		}else {
			min = cider;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int burger1, burger2, burger3;
		int coke, cider;
		while(true) {
			burger1 = sc.nextInt();
			burger2 = sc.nextInt();
			burger3 = sc.nextInt();
			coke = sc.nextInt();
			cider = sc.nextInt();
			
			if(judgePrice(burger1) && judgePrice(burger2) && judgePrice(burger3) && judgePrice(coke) && judgePrice(cider)) {
				break;
			}else {
				System.out.println("가격은 100원 이상, 2000원 이하입니다.");
			}
		}
		
		System.out.println(minBurger(burger1, burger2, burger3) + minDrink(coke, cider) - 50);
	}
}
