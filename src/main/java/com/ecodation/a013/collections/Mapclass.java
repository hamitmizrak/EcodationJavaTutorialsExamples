package com.ecodation.a013.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapclass {
	// HHLT

	public static void main(String[] args) {
		// Map<Integer,String> mapList=new HashMap(); diamond operators
		Map<Integer, String> mapList = new HashMap<Integer, String>();
		mapList.put(1, "Başak");
		mapList.put(2, "Merve");
		mapList.put(3, "Yağmur");

		/*
		 * Set set=mapList.keySet(); Iterator ite=set.iterator(); While(ite.hasNext()){
		 * Sout(ite.next()); //sadece //sout(mapList.get(ite.next()); bununla bütün
		 * değerler } Sout(mapList.get(1));
		 * 
		 */

		for (Integer temp : mapList.keySet()) {
			String hepsi = mapList.get(temp);
			System.out.println(temp + " " + hepsi);
		}

		Set set = mapList.keySet();
		Iterator ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(mapList.get(ite.next()));
		}

	}
}
