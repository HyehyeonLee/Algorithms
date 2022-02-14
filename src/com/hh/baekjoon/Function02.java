package com.hh.baekjoon;

public class Function02 {
	public static int getSelfNum(int n) {
		boolean flag = false;
		String[] arr = String.valueOf(n).split("");
		int selfNum = n;
		
		for(int i = 0; i<arr.length; i++) {
			selfNum += Integer.parseInt(arr[i]);
		}

		return selfNum;
	}
	
	public static void main(String[] args) {
		boolean[] chk = new boolean[10001];
		
		for(int i = 1; i<10001; i++) {
			int n = getSelfNum(i);
			
			if(n < 10001) {
				chk[n] = true;
			}
		}
		
		for(int i = 1; i<10001; i++) {
			if(!chk[i]) {
				System.out.println(i);
			}
		}
	}
}
