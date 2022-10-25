package com.hh.programmers.level0;

public class PlusDigit {
    public int solution(int n) {
        int answer = 0;
        String nStr = String.valueOf(n);

        for(int i = 0; i<nStr.length(); i++){
            answer += Integer.parseInt(nStr.substring(i, i+1));
        }

        return answer;
    }

    public static void main(String[] args) {
        PlusDigit sol = new PlusDigit();
        System.out.println(sol.solution(1234));
    }
}
