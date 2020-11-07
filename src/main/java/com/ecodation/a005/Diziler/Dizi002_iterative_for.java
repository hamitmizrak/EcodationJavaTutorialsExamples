package com.ecodation.a005.Diziler;

public class Dizi002_iterative_for {

	public static void main(String[] args) {
		// double [] dizi=new double[3];
		double[] dizi = { 44.44, 23.23, 34.34 };
		// System.out.println(dizi[2]);

		// iterative for = indis bize lazýmsa
		for (int i = 0; i <= 2; i++) {
			// System.out.println(dizi[i]);
			// Math.round((dizi[i] * 2 + 5));
			// System.out.println();
		}

		// iterative for = lenght
		for (int i = 0; i < dizi.length; i++) {
			// System.out.println(dizi[i]);
			// Math.round((dizi[i] * 2 + 5));
			System.out.println(dizi[i]);
		}

	}
}
