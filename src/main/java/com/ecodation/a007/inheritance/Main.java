package com.ecodation.a007.inheritance;

public class Main {

	public static void main(String[] args) {
		Mac mac = new Mac();
		mac.setId(1);
		mac.setAnakart("45ýc8mac_anakart");
		mac.setIslemci("85Xymac-iþlemci");
		mac.setRam(34.44);
		mac.setKlavye("new serial Xyk9");

		System.out.println("MAC \nID: " + mac.getId() + "\nmacram: " + mac.getRam() + "\nklavye: " + mac.getKlavye());
		System.out.println("-------------------");

		Msi msi = new Msi();
		msi.setId(5);

		msi.setIslemci("85Xymac-iþlemci");
		msi.setRam(34.44);
		msi.setGl7595d("gl7595d");

		System.out.println("MSÝ \nID: " + msi.getId() + "\nmsiram: " + msi.getRam());
		System.out.println("\nklavye: " + msi.getKlavye());

	}
}
