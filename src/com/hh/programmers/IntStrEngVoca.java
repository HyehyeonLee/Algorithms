package com.hh.programmers;

public class IntStrEngVoca {
	
	public int solution(String s) {
        int answer = 0;
        String[] numbers = {"zero", "one", "two", "three", "four", "five", 
        		"six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0; i<numbers.length; i++) {
        	if(s.contains(numbers[i])) {
        		s = s.replace(numbers[i], num[i]);
        	}
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
	
	public static void main(String[] args) {
		IntStrEngVoca sol = new IntStrEngVoca();
		String s = "one4seveneight";
		System.out.println(sol.solution(s));
	}
}
