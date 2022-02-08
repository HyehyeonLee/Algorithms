package com.hh.programmers;

public class Harshad {
	public boolean solution(int x) {
        boolean answer = false;
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++) {
        	sum += Character.getNumericValue(arr[i]);
        }
        
        if(x % sum == 0) {
        	answer = true;
        }
        return answer;
    }

	public static void main(String[] args) {
		Harshad sol = new Harshad();
		int x = 10;
		//sol.solution(x);
		System.out.println(sol.solution(x));
	}

}
