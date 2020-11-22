package com.ecodation.a012.jenerics;

public class MainJenerics {
	public static void main(String[] args) {
		J001_JenericsClass<String> jenerics = new J001_JenericsClass<String>();
		jenerics.setName("Hamit");
		jenerics.setSurname("Mızrak");
		jenerics.setPassword(1235);

		System.out.println("ad: " + jenerics.getName() + " soyadi: " + jenerics.getSurname() + " şifre: "
				+ jenerics.getPassword());
	}

}
