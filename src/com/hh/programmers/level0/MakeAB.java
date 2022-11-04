package com.hh.programmers.level0;

import java.util.Arrays;

public class MakeAB {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beStrs = before.split("");
        String[] afStrs = after.split("");

        Arrays.sort(beStrs);
        Arrays.sort(afStrs);

        for(int i = 0; i<beStrs.length; i++){
            if (beStrs[i].equals(afStrs[i])){
                answer = 1;
            }else{
                answer = 0;
                break;
            }
        }
        return answer;
    }
}
