package com.hh.programmers.level0;

public class ChangeIndex {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] strs = my_string.split("");
        String temp = "";

        temp = strs[num1];
        strs[num1] = strs[num2];
        strs[num2] = temp;

       for(String s : strs){
            answer += s;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
