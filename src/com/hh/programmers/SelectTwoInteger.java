package com.hh.programmers;

import java.util.TreeSet;

public class SelectTwoInteger {
    //두 개 뽑아서 더하기
    public SelectTwoInteger(){
        super();
    }

    public int[] solution(int[] numbers){
        int[] answer = {};
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<i; j++){
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }

        answer = new int[set.size()];
        int idx = 0;
        for(int num : set){
            answer[idx] = num;
            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};

        SelectTwoInteger sol = new SelectTwoInteger();
        int[] answer = sol.solution(numbers);
        for(int i = 0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
