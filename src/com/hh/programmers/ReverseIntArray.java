package com.hh.programmers;

public class ReverseIntArray {
	//자연수 뒤집어 배열로 만들기
	public int[] solution(long n) {
        String strs[] = String.valueOf(n).split("");
        int[] answer = new int[strs.length];
        
        for(int i = strs.length ; i>0; i--) {
        	answer[strs.length-i] = Integer.parseInt(strs[i-1]);
        	
        }
        return answer;
    }
	
	public static void main(String[] args) {
		ReverseIntArray sol = new ReverseIntArray();
		long n = 12345;
		int[] answer = sol.solution(n);
		
		for(int a : answer) {
			System.out.print(a + " ");
		}
	}
}
