package com.ecodation.ornekler;

import java.util.Scanner;

public class Aklindan {
	public void akil() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Aklinizdan  1 ile 100 arasinda bir sayi tutun\n");
		System.out.println("Tuttunuz sayi  giriniz...");
		int sayi, sayi2;
		sayi = klavye.nextInt();
		System.out.println("Simdi bu adımları yapın\n");
		System.out.println("tuttuğunuz sayıyı 2 ile çarpın");
		System.out.println("sonuca 22 ile toplayın");
		System.out.println("sonucu 2 ile bölelim");
		System.out.println("�?imdi aklından ilk tuttuğun sayıyı, sonuctan çıkarın\n");
		System.out.println("sonucu gomek icin klavyeden herhangi bir sayı giriniz");
		// klavye.nextLine();
		sayi2 = Math.abs(klavye.nextInt());
		while (sayi2 >= 0) {
			int sonuc = (((sayi * 2) + 22) / 2) - sayi;
			System.out.println("sonucunuz: " + sonuc);
			break;
		}
	}
}
