package com.hh.programmers.level0;

public class Count7 {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";

        for(int a : array){
            str += a;
        }

        for(int i = 0; i<str.length(); i++){
            if(str.substring(i, i+1).equals("7")){
                answer++;
            }
        }

        return answer;
    }
}
