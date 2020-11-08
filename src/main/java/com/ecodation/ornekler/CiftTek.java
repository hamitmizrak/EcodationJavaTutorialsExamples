package com.ecodation.ornekler;

import java.util.Scanner;

public class CiftTek {

	public static void main(String[] args) {
		while (true) {
			secim();

		}

	}

//seçim metodu
	private static void secim() {
		int secim;
		Scanner klavye = new Scanner(System.in);
		System.out.println("\nLütfen seçim yapýnýz");
		System.out.println("1. tek çift hesapla");
		System.out.println("2. çýkýþ yapsýn");
		secim = klavye.nextInt();
		switch (secim) {
		case 1:
			System.out.println("hesapla yapýlacak");
			sayiTekCift();
			break;

		case 2:
			System.out.println("çýkýþ yapýlýyor ....");
			System.exit(0);
			break;

		default:
			break;
		}
	}

	// Metot
	private static void sayiTekCift() {
		int sayi;
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		sayi = klavye.nextInt();

		if (sayi % 2 == 0) {
			System.out.println("sayý çifttir");
		} else {
			System.out.println("Sayý tektir");
		}

	}

}
