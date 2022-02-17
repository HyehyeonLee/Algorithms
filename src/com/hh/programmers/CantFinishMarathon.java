package com.hh.programmers;

import java.util.HashMap;
import java.util.Map.Entry;

public class CantFinishMarathon {
	//완주하지 못한 선수
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String player : participant) {
        	map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        for(String player : completion) {
        	map.put(player, map.get(player) - 1);
        }
        
       for(Entry<String, Integer> entry : map.entrySet()) {
    	   if(entry.getValue() != 0) {
    		   answer = entry.getKey();
    	   }
       }

        return answer;
    }
	
	public static void main(String[] args) {
		CantFinishMarathon sol = new CantFinishMarathon();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(sol.solution(participant, completion));
	}
}
