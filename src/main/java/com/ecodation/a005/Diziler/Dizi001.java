package com.ecodation.a005.Diziler;

public class Dizi001 {

	public static void main(String[] args) {

		int[] dizi = new int[10];
		dizi[5] = 5;
		dizi[0] = 1;
		dizi[1] = 1;
		dizi[9] = 9;
		// Herhangi bir þey yazmazsak default olarak sýfýr eklenir.

		System.out.println(dizi[3]);
		System.out.println(dizi[12]); // elemanda eriþim olmuyor

	}
}
