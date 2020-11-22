package com.ecodation.a013.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		// H=HashSet =karışık indisi tekrarsız veriler
		// L=LinkedHashSet =eklediğimiz sırada tekrarsız veriler
		// T= TreeSet = sıralamalı tekrarsız veriler

		// Set<Integer> numberList = new LinkedHashSet<Integer>();
		// Set<Integer> numberList = new HashSet<Integer>();
		Set<Integer> numberList = new TreeSet<Integer>();
		numberList.add(10);
		numberList.add(10);
		numberList.add(8);
		numberList.add(9);
		numberList.add(20);
		numberList.add(20);
		numberList.add(5);

		for (int temp : numberList) {
			System.out.println(temp);
		}

	}
}
