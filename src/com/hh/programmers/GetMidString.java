package com.hh.programmers;

public class GetMidString {
    //가운데 글자 가져오기
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
