package com.hh.thisiscoding;

public class Q301 {
	public static void main(String[] args) {
		int n = 1260;
		int count = 0;
		int[] coinTypes = {500, 100, 50, 10};
		
		for(int i = 0; i<4; i++) {
			int coin = coinTypes[i];
			count = count + (n / coin);
			n = n % coin;
		}
		
		System.out.println(count);
	}
}
