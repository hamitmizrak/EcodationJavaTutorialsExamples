package com.ecodation.ornekAVM;

import java.util.Scanner;

public class AvmMain {

	public static void main(String[] args) {
		// Genel tekrardaki bütün konular olacak;
		// Common roles
		// operatorler
		// primitive
		// wrapper
		// underScore
		// String StringBuilder StringTokenizer
		// System
		// Tarih ve/veya calendar
		// for - while -doWhile -forEach
		// if else
		// static Collection(Dinamik diziler)
		// MEthods
		// static final yapısı
		// trycatch
		// finally
		// inheitance
		// interface
		// abstract
		// enum
		// Generics
		// Dynamics Collection(Dinamik diziler)
		// IO olsun

		Scanner klavye = new Scanner(System.in);
		int secim;
		AtesOlcer ates = new AtesOlcer();
		boolean sonuc = ates.atesOlcumu(35);

		while (2 > 1) {
			if (sonuc) {
				System.out.println("Nereye gitmek istiyor sunuz ?");
				System.out.println("1-) ATM  2-) Yemek 3-) Sinema 4-) Kütüphane 5-) Caffee 6-) Çıkış");
				secim = klavye.nextInt();
				switch (secim) {

				case 1:
					atm();
					break;

				case 2:
					yemek();
					break;

				case 3:
					sinema();
					break;

				case 4:
					kutuphane();
					break;

				case 5:
					cafee();
					break;

				case 6:
					System.out.println("Avm'den çıkış yapılıyor iyi günler dileriz.");
					System.exit(0);
					break;

				default:
					System.out.println("Lütfen belirtilen alanları seçiniz");
					break;
				}

			} else {
				System.err.println("Hastaneye gidilmesi gerekiyor ...");
				return;
			}

		}

	}

	private static void cafee() {
		System.out.println("Cafee gidiliyor ....");

	}

	private static void kutuphane() {
		System.out.println("kutuphane gidiliyor ....");

	}

	private static void sinema() {
		System.out.println("sinema gidiliyor ....");

	}

	private static void yemek() {
		System.out.println("yemek gidiliyor ....");

	}

	private static void atm() {
		System.out.println("atm gidiliyor ....");
//		System.out.println("Avm Giriş yapılıyor.");
//		Login login = new Login();
//		boolean giris = login.adminGiris();

	}
}
