package com.hh.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

class Word implements Comparable<Word> {
	private String word;
	private int length;

	public Word(String word, int length) {
		super();
		this.word = word;
		this.length = length;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Word o) {
		
		return 0;
	}

}

public class Sort08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		Word w;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String word = sc.nextLine();
			int length = word.length();
			if (!list.contains(word)) {
				w = new Word(word, length);
				list.add(w);
			}
		}

	}
}
