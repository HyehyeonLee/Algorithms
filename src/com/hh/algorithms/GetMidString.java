package com.hh.algorithms;

import java.util.StringTokenizer;

public class GetMidString {
    //가운데 글자 가져오기
    //단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	public GetMidString() {
		super();
	}
	
    public String solution(String s){
        String answer = "";
        if(s.length() % 2 == 1) {
            answer = s.substring((s.length()/2), (s.length()/2)+1);
        }else {
            answer = s.substring((s.length()/2)-1, (s.length()/2)+1);
        }
        return answer;
    }

    public static void main(String[] args) {
    	String s = "qwer";
    	GetMidString gm = new GetMidString();
    	System.out.println(gm.solution(s));
    }
}
