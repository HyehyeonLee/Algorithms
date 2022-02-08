package com.hh.thisiscoding;

public class Q401 {
	public int[] solution(int n, String[] plans) {
		int[] answer = new int[2];
		int x = 1, y = 1;
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		String[] move_types = {"L", "R", "U", "D"};
		int nx = 0, ny = 0;
		
		for(String plan : plans) {
			for(int i = 0; i<move_types.length; i++) {
				if(plan == move_types[i]) {
					nx = x + dx[i];
					ny = y + dy[i];
					//System.out.println(nx + ", " + ny);
				}
			}
			if(nx < 1 || ny < 1 || nx > n || ny > n) {
				continue;
			}
			x = nx;
			y = ny;
		}
		
		answer[0] = x;
		answer[1] = y;
		return answer;
	}
	public static void main(String[] args) {
		int n = 5;
		String[] plans = {"R", "R", "R", "U", "D", "D"};
		Q401 sol = new Q401();
		int[] answer = sol.solution(n, plans);
		for(int i : answer) {
			System.out.print(i + " ");
		}
	}

}
