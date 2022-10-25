package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Member implements Comparable<Member> {
	private int age;
	private String name;
	private int idx;

	public Member(int age, String name, int idx) {
		super();
		this.age = age;
		this.name = name;
		this.idx = idx;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	@Override
	public int compareTo(Member m) {
		if (this.age == m.age) {
			return this.idx - m.idx;
		}
		return this.age - m.age;
	}
}

public class Sort10 {
	// 백준 10814번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> list = new ArrayList<Member>();
		Member m;
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			m = new Member(age, name, i);
			list.add(m);
		}
		
		Collections.sort(list);
		
		for(int j = 0; j<list.size(); j++) {
			
			if(list.get(j) != null) {
				System.out.println(list.get(j).getAge() + " " + list.get(j).getName());
			}
		}
		
		
	}
}
