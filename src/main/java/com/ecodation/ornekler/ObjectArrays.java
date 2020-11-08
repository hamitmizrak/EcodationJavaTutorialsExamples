package com.ecodation.ornekler;

import java.util.Arrays;

public class ObjectArrays {

	public static void main(String[] args) {
		// int[] arr = new int[5];
		Object[] arr = new Object[5];

		arr[0] = 44; // tamsayı
		arr[1] = 34.44;// virgüllü sayı
		arr[2] = "Merhaba"; // String
		arr[3] = 'h'; // char
		arr[4] = true;

		for (Object temp : arr) {
			// System.out.print(temp + " ");
		}

		int[] odev = { 8, 1, 9, 0, 5, 6, 5 };
		// Static tek boyutlu dizim ve bu dizi başka bir diziye clone yapalım. (for each
		// her bir yapının içeriğini bir artılalım.
		// Diziyi sırasın (KÜÇÜKTEN BÜYÜ�?E
		// büyükten küçüğe doğru

		for (int temp : odev) {
			System.out.print(temp);
		}
		System.out.println();
		System.out.println("------------------");

		int[] clone = new int[odev.length];
		for (int i = 0; i < odev.length; i++) {

			clone[i] = odev[i];
		}

		for (int temp : clone) {
			System.out.print(temp);
		}
		System.out.println();
		//
		System.out.println("Artırmak");
		for (int i = 0; i < clone.length; i++) {
			clone[i] = clone[i] + 1;
		}

		for (Object artir : clone) {
			System.out.print(artir);
		}

		System.out.println(" ");
		Arrays.sort(odev);
		for (int temp : odev) {
			System.out.print(temp);
		}

		for (int i = clone.length; i <= 0; i--) {
			System.out.println(clone[i]);
		}

	}
}
