package com.hh.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue queue = new LinkedList<Integer>();
        for(int data : priorities) {
        	queue.offer(data);
        }
        while(!queue.isEmpty()) {
        	boolean flag = false;
        	for(int i = 0; i<queue.size(); i++) {
        		if((int)queue.peek() < (int)queue.toArray()[i]) {
        			flag = true;
        			break;
        		}
        	}
        	
        	if(flag) {
        		queue.offer(queue.poll());
        		
        		location--;
        		
        		if(location < 0) {
        			location = queue.size()-1;
        		}
        	}else {
        		if(location == 0) {
        			answer++;
        			queue.clear();
        		}else {
        			queue.poll();
        			answer++;
        			location--;
        			
        			if(location < 0) {
        				location = queue.size()-1;
        			}
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Printer sol = new Printer();
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(sol.solution(priorities, location));
	}
}
