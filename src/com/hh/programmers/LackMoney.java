package com.hh.programmers;

public class LackMoney {
	//부족한 금액 계산하기
	public long solution(int price, int money, int count) {
        long answer = 0;
        long need = 0;
        for(int i = 1; i<=count; i++) {
        	need += (price * i);
        }
        
        if(need > money) {
        	answer = need - money;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		LackMoney sol = new LackMoney();
		System.out.println(sol.solution(price, money, count));
	}
}
