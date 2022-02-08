package com.hh.programmers;

import java.util.Locale;

public class ReturnJadenCase {
    public ReturnJadenCase(){
        super();
    }

    public String solution(String s) {
        String answer = "";
        char c[] = s.toLowerCase(Locale.ROOT).toCharArray();

        for(int i = 0; i<c.length; i++){
            if(c[i] == ' ' && i != c.length-1 && (c[i+1] >= (char)97 && c[i+1] <= (char)122)){
                c[i + 1] -= 32;
            }else if(i == 0 && (c[i] >= (char)97 && c[i] <= (char)122)){
                c[i] -= 32;
            }
            answer += c[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ReturnJadenCase sol = new ReturnJadenCase();
        System.out.println(sol.solution("3people unFollowed me "));
    }
}
