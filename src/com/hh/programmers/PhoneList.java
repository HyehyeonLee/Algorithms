package com.hh.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneList {
    //전화번호 목록
    public PhoneList(){
        super();
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String prefix = phone_book[0];
        int idx = 0;

        for(int i = 0; i<phone_book.length; i++){
            if(phone_book[i].length() < prefix.length()){
                prefix = phone_book[i];
                idx = i;
            }
        }

        for(int i = 0; i<phone_book.length; i++){
            if(i == idx){
                continue;
            }
            if(phone_book[i].startsWith(prefix)){
                answer = false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PhoneList phone = new PhoneList();
        String[] phone_book = {"97674223", "1195524421", "119"};
        System.out.println(phone.solution(phone_book));
    }
}
