package com.ecodation.a013.collections;

import java.util.LinkedList;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {
		// L - A - V
		// List<String> listem = new LinkedList<String>(); // silmek araya yerleşme
		// List<String> listem2 = new ArrayList<String>(); // ekleme arama
		// Vector<Integer> v1 = new Vector<Integer>();

		// ArrayList<Integer> list=new ArrayList<>();
		// List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		list.add("Başak");
		list.add("Merve");
		list.add("Yağmur");
		list.add("Hamit");
		list.add("2020");

		for (String temp : list) {
			System.out.println("Tam liste:" + temp);
		}

		System.out.println("--------------------");
		list.remove(3);
		for (String temp : list) {
			System.out.println("silinmiş liste:" + temp);
		}

	}
}
