package com.ecodation.a005.Diziler;

import java.util.Arrays;

public class Dizi008_siralama_sort_binary_search {

	public static void main(String[] args) {

		int[] dizi = { 4, 5, 3, 2, 9 };

		// binary search i�in �nce Arrays.sort() yapmal�y�m
		Arrays.sort(dizi);
		int arama = Arrays.binarySearch(dizi, 96);
		// System.out.println(arama);
		if (arama < 0) {
			System.out.println("aran�lan de�er YOKTUR");

		} else {
			System.out.println("aran�lan de�er bulunuyor" + " 2");
		}

//		for (int temp : dizi) {
//			System.out.print(temp + " ");
//		}
	}
}
