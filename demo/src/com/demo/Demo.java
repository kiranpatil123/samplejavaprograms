package com.demo;

public class Demo {

	public static void main(String[] args) {
		/*
		 * String s1 = "hi44"; boolean b = s1.matches("\\d+"); System.out.println(b);
		 * 
		 * 
		 * String s2="44hi"; String replaceAll = s1.replaceAll("\\D", "");
		 * System.out.println(replaceAll);
		 * 
		 * String replaceAll2 = s2.replaceAll("\\D", "");
		 * System.out.println(replaceAll2);
		 * 
		 * int i = Integer.parseInt(replaceAll); int j = Integer.parseInt(replaceAll2);
		 * 
		 * int k=i+j; System.out.println(k);
		 */

		/*
		 * String s3 = "hi,hello,how,are,you"; int length = s3.length();
		 * System.out.println(length); String string = s3.replaceAll(",", " ");
		 * System.out.println(string);
		 * 
		 * int a[]= {1,2,3,4}; int length2 = a.length;
		 */

		/*
		 * String s4 = " hi hello "; System.out.println(s4);
		 * 
		 * System.out.println(s4.trim());
		 * 
		 * 
		 * String s5="abopc67"; boolean matches = s5.matches("\\w+");
		 * System.out.println(matches);
		 */

		String s1 = "hi,hello,how,are,you";
		String[] split = s1.trim().split(",");

		/*
		 * for (int i = split.length - 1; i >= 0; i--) { System.out.println(split[i]); }
		 */

		String s4[] = null;
		for (int i = 0; i < split.length; i++) {
			// System.out.println(split[i]);
			// s4 =" "+split[i] + s4;

			char[] cs = split[i].toCharArray();
			for (int j = cs.length - 1; j >= 0; j--) {

				System.out.print(cs[j]+" ");
			}

		}
		// System.out.println(s4);
	}
}
