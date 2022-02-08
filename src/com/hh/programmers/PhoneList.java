package com.hh.programmers;

import java.util.HashMap;
import java.util.Map.Entry;

public class PhoneList {
	
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String phone : phone_book) {
        	map.put(phone, 0);
        }
        
        for(int i = 0; i<phone_book.length; i++) {
        	for(int j = 0; j<phone_book[i].length(); j++) {
        		String key = phone_book[i].substring(0, j);
        		if(map.containsKey(key)) {
        			answer = false;
        		}
        	}
        }
        
        return answer;
    }

    public static void main(String[] args) {
        PhoneList phone = new PhoneList();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(phone.solution(phone_book));
    }
}
