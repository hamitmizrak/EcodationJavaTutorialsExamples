
package com.ecodation.ornekler;

import java.util.Scanner;

public class AsalSayi_debug {
//debug=hatayý adým adým çözmeye yarar.
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		int sayi;
		boolean flag = true;
		System.out.println("sayý giriniz  giriniz");
		sayi = klavye.nextInt();

		// 1 ve kendisine bölünebilen sayýlardýr.
		// en küçük asal sayý 2

		try {

			if (sayi < 2) {
				System.out.println("2'den küçük sayý giremeyiz");

			} else {

//asal sayýlar 1 ve kendine bölünebilen   15 asal sayý deðildir= 1 15 3 5
				for (int i = 2; i < sayi; i++) {
					if (sayi % i == 0) {
						flag = false;
						break;
					}

				}

				if (flag) {
					System.out.println(sayi + " sayýsý " + "Asal sayýdýr");
				} else {
					System.out.println(sayi + " sayýsý " + "Asal sayý deðildir");
				}
			}

		} catch (Exception e) {
			System.out.println("Lütfen sayý giriniz");

		}

	}
}
