package com.demo;

public class StringNumber {
	public static void main(String[] args) {
		String s1 = "1234";
		boolean b = s1.matches("\\d+");
		System.out.println(b);
	}
}
