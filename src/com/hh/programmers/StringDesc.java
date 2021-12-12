package com.hh.programmers;

public class StringDesc {
	public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        
        for(int i = 0; i<arr.length; i++) {
        	for(int j = 0; j<i; j++) {
        		if(arr[i] > arr[j]) {
        			char temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        
        for(int i = 0; i<arr.length; i++) {
        	answer += Character.toString(arr[i]);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		StringDesc sol = new StringDesc();
		String s = "Zbcdefg";
		System.out.println(sol.solution(s));
	}
}
