package com.hh.programmers.level0;

public class AgeOfAlien {
    public String solution(int age) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        String answer = "";
        String ageStr = String.valueOf(age);
        for(int i = 0; i<ageStr.length(); i++){
            int idx = Integer.parseInt(ageStr.substring(i, i+1));
            answer += alphabet[idx];
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
