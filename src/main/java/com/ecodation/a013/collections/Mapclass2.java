package com.ecodation.a013.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapclass2 {
	// HHLT

	public static void main(String[] args) {
		// Map<Integer,String> mapList=new HashMap(); diamond operators
		Map<Integer, String> mapList = new HashMap<Integer, String>();
		mapList.put(1, "Başak");
		mapList.put(2, "Merve");
		mapList.put(3, "Yağmur");

		// key için
		for (Object temp : mapList.keySet()) {
			System.out.println("anahtar: " + temp); // key
		}

		System.out.println("-------------");

		// value için
		for (String temp : mapList.values()) {
			System.out.println("değer: " + temp);
		}

		System.out.println("+++++++++++++");
		// Key +Values
		for (Object ulke : mapList.keySet()) {
			String hepsi = mapList.get(ulke);
			System.out.println(ulke + " " + hepsi);
		}

		/*
		 * for (Object temp : mapList) { System.out.println(temp); }
		 */

	}
}
