package com.ecodation.a005.Diziler;

import java.util.Arrays;

public class Dizi007_siralama_sort {

	public static void main(String[] args) {

		int[] dizi = { 4, 5, 3, 2, 9 };

		// s�rlama olmadan �nce
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}

		System.out.println("\n------------------");
		// Arrays.sort();
		// S�ralamdan sonra
		Arrays.sort(dizi);
		for (int temp : dizi) {
			System.out.print(temp + " ");
		}
	}
}
