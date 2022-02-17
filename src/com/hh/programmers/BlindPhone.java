package com.hh.programmers;

public class BlindPhone {
	// 핸드폰 번호 가리기
	public String solution(String phone_number) {
		String answer = "";
		int n = phone_number.length() - 4;
		for (int i = 0; i < n; i++) {
			answer += "*";
		}
		answer += phone_number.substring(n);
		return answer;
	}

	public static void main(String[] args) {
		String phone_number = "027778888";
		System.out.println(phone_number.length());
		BlindPhone sol = new BlindPhone();
		System.out.println(sol.solution(phone_number));
	}
}
