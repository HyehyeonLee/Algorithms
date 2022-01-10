package com.hh.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class PhoneList {
    //전화번호 목록
	//효율성 테스트 3,4 통과 X
	//정확성: 83.3
	//효율성: 8.3
	//합계: 91.7 / 100.0
    public PhoneList() {
        super();
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (String phone : phone_book) {
            for (String key : phone_book) {
                if (phone.startsWith(key) && !phone.equals(key)) {
                    answer = false;
                    break;
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
