package com.hh.programmers;

public class MakeOddString {
	//이상한 문자 만들기
	public String solution(String s) {
        String answer = "";
        int idx = 1;
        for(int i = 0; i<s.length(); i++){
            String str = s.substring(i,i+1);
            if(str.equals(" ")){
                idx = 1;
                answer += str;
                continue;
            }
            
            if(idx % 2 != 0){
                answer += String.valueOf(str.toUpperCase());
                idx++;
            }else{
                answer += String.valueOf(str.toLowerCase());
                idx++;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		
	}

}
