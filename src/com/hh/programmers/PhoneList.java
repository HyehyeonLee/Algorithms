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
        for(int i = 0; i<phone_book.length; i++){
                if(!hash.containsKey(phone_book[i])){
                    hash.put(phone_book[i], idx);
                }else{
                    hash.put(phone_book[i], idx+1);
                }
        }


        for(String key : hash.keySet()){
            for(String phone : phone_book){
                if(phone.startsWith(key) && !phone.equals(key)){
                    hash.put(phone, idx+1);
                }
            }
        }

        int flag = 0;
        for(int v : hash.values()){
            flag += v;
        }

        if(flag != 0){
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
