package com.hh.review;

public class Auto01 {
	//1부터 자연수를 이어쓰면 1234567891011121314..가 됩니다. 
	//이렇게 이어쓴 숫자를 A라 할 때, n번째에 위치하는 숫자를 반환하는 함수 solution을 완성해주세요.
	public int solution(int n) {
		int answer = 0;
		String str = "";
		
		for(int i = 1; i<=n; i++) {
			str += String.valueOf(i);
			if(str.length() > n) {
				break;
			}
		}
		System.out.println(str);
		answer = Integer.parseInt(str.substring(n-1, n));
		
		return answer;
	}
	public static void main(String[] args) {
		Auto01 sol = new Auto01();
		int n = 13;
		System.out.println(sol.solution(n));
	}
}
