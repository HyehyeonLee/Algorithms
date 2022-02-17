package com.hh.programmers;

public class FindKim {
    //서울에서 김서방 찾기
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x = i;
                break;
            }
        }
        answer = "김서방은 " + x + "에 있다";
        return answer;
    }
}
