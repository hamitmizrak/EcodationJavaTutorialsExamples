package com.ecodation.a013.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTutorials {

	public static void main(String[] args) {

		// tekrarsız Karışık indis
		Set<Integer> set44 = new HashSet<Integer>();
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
