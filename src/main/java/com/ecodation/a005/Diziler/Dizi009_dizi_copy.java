package com.ecodation.a005.Diziler;

public class Dizi009_dizi_copy {

	public static void main(String[] args) {
		int arr7[] = { 4, 6, 9, 88 };

		int arr8[] = new int[arr7.length];

		for (int i = 0; i < arr7.length; i++) {
			arr8[i] = arr7[i];
		}
		for (int i8 : arr8) {
			System.out.println("kopyalama:" + i8);
		}
	}

}
