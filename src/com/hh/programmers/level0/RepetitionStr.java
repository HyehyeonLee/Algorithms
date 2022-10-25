package com.hh.programmers.level0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RepetitionStr {
    //중복된 문자 제거
    public String solution(String my_string) {
        String answer = "";
        String[] strs = my_string.split("");
        List<String> list = Arrays.asList(strs);
        List<String> newList = list.stream().distinct().collect(Collectors.toList());

        for(int i = 0; i<newList.size(); i++){
            answer += newList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
