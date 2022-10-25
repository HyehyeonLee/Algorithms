package com.hh.programmers.level0;

public class Game369 {
    public int solution(int order) {
        int answer = 0;
//        while(order > 0){
//            int o = order % 10;
//            order/=10;
//            if(o % 3 == 0){
//                answer++;
//            }
//        }

        String str = String.valueOf(order);

        for(int i = 0; i<str.length(); i++){
            int o = Integer.parseInt(str.substring(i, i+1));
            if(o == 3 || o == 6 || o == 9){
                answer++;
            }
        }
        return answer;
    }
}
