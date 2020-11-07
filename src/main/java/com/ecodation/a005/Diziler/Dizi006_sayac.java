package com.ecodation.a005.Diziler;

public class Dizi006_sayac {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i > j) {
					System.out.print(count + " ");
					count++;
				}

			}
			System.out.println("");
		}
	}

}
