package com.hh.baekjoon;

public class Function01 {
	//백준 15596번
	long sum(int[] a) {
        long ans = 0;
        for(int i : a){
            ans += i;
        }
        return ans;
    }
}
