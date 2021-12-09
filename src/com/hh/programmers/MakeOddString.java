package com.hh.programmers;

public class MakeOddString {
	public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i = 0; i<arr.length; i++) {
        	if(arr[i] == ' ') {
        		arr[i+1] = (char)(arr[i+1] - 32);
        	}else if(i == 0) {
        		arr[i] = (char)(arr[i] - 32);
        	}
        }
        answer = String.valueOf(arr);
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "try hello world";
		MakeOddString sol = new MakeOddString();
		System.out.println(sol.solution(s));
	}
}
