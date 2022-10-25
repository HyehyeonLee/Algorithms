package com.hh.programmers.level0;

import java.util.Arrays;

public class StringOrder {
    public int[] solution(String my_string) {
        int[] answer;
        String intStr = my_string.replaceAll("[^0-9]", "");

        answer = new int[intStr.length()];

        for(int i = 0; i<intStr.length(); i++){
            answer[i] = Integer.parseInt(intStr.substring(i, i+1));
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        StringOrder sol = new StringOrder();
        int[] answer = sol.solution("hi12392");
        for(int a : answer){
            System.out.println(a);
        }
    }
}
