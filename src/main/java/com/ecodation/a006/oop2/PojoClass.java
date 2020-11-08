package com.ecodation.a006.oop2;

public class PojoClass {
	// POJO= plain Old Java Object
	// POJO> Bean >ManagedBean>CDI

	// Nesne değişkeni
	private String name = "";
	private String surname = "";

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
