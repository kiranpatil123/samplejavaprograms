package com.demo;

public class StringDemo {
	public static void main(String[] args) {

		String s1 = "hello";
		char[] cs = s1.toCharArray();
		int k = 0;
		for (int i = 0; i < cs.length; i++) {
			for (int j = i + 1; j < cs.length; j++) {
				if (cs[i] == cs[j]) {
					k++;

				}
				
			}
			if (k == 0) {
				System.out.println(cs[i]);

				break;
			}
		}
	}
}
