package com.hh.programmers;

import java.util.TreeSet;

public class SelectTwoInteger {
    //두 개 뽑아서 더하기
    //정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    // 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
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
