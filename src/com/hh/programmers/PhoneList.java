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
        HashMap<String, Integer> hash = new HashMap<>();
        int idx = 0;
        for(String phone : phone_book){
            hash.put(phone, idx);

        }

        for(String phone : phone_book){
            for(String key : hash.keySet()){
                if(phone.startsWith(key) && !phone.equals(key)){
                    hash.put(phone, idx+1);
                }
            }
        }

        if(hash.containsValue(1)){
            answer = false;
        }


        //System.out.println(hash.toString());

        return answer;
    }

    public static void main(String[] args) {
        PhoneList phone = new PhoneList();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(phone.solution(phone_book));
        String str = "1195524421";
        //System.out.println(str.substring(0,3));
    }
}
