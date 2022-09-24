package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Coordinate implements Comparable<Coordinate> {
	private int x;
	private int y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int compareTo(Coordinate o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}

	@Override
	public String toString() {
		return x + " " + y;
	}
	
	

}

public class Sort07 {
	// 백준 11650번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Coordinate2> list = new ArrayList<Coordinate2>();
		Coordinate2 c;
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			c = new Coordinate2(x, y);
			list.add(c);
		}
		
		Collections.sort(list);
		for(int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j).toString());
		}
		
	}
}
