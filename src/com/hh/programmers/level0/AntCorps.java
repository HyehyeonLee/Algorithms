package com.hh.programmers.level0;

public class AntCorps {
    public int solution(int hp) {
        int answer = 0;
        int[] arr = {5, 3, 1};
        for(int i = 0; i<arr.length; i++){
            answer += hp / arr[i];
            hp %= arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int hp = 24;
        AntCorps sol = new AntCorps();
        System.out.println(sol.solution(hp));
    }

}
