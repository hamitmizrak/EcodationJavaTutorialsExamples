package com.ecodation.a010.interfaces;

public class Istanbul implements ISozlesme {

	public void maskeniTak(boolean taktim) {
		taktim = true;
		if (taktim) {
			System.out.println("Evet Maskemi taktım");
		} else {
			System.out.println("Takmadım");
		}

	}

	public void marketeGit() {
		System.out.println("Markete gittim");

	}

	public void urunAl() {
		System.out.println("Ürün aldım");

	}

	public void paraOde() {
		System.out.println("Para öde");

	}

	public void eveGel() {
		System.out.println("Eve geldim.");

	}

	public static void main(String[] args) {
		Istanbul istanbul = new Istanbul();
		istanbul.eveGel();
	}

}
