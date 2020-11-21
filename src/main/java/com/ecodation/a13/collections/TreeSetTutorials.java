package com.ecodation.a13.collections;

import java.util.Iterator;
import java.util.Set;

public class TreeSetTutorials {
	public static void main(String[] args) {

		// Tekrarsız ve sıralı
		Set<Integer> set44 = new java.util.TreeSet<Integer>();
		set44.add(20);
		set44.add(10);
		set44.add(30);
		set44.add(50);
		set44.add(40);
		set44.add(10);

		Iterator ite = set44.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}
}
