package com.hh.programLecture;

public class RectCoord {
	public int[] solution(int[][] v) {
        int[] answer = new int[2];
        for(int i = 0; i<v.length; i++) {
        	answer[0] ^= v[i][0];
        	answer[1] ^= v[i][1];
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int[][] v = {
				{1, 4},
				{3, 4},
				{3, 10}
		};
		
		RectCoord sol = new RectCoord();
		for(int i : sol.solution(v)) {
			System.out.print(i + ", ");
		}
		//System.out.println(sol.solution(v));
	}
}
