package com.ecodation.a12.jenerics;

public class J002_JenericsMethods<T> {

	/*
	 * public static String jenericsMethod() { return
	 * "merhabalar ben jenerics methodum"; }
	 */

	public static <T> Integer jenericsMethod(T name, T surname) {
		return (Integer) name;
	}

	public static void main(String[] args) {
		int result = jenericsMethod(4455, 44);
		System.out.println(result);
	}
}
