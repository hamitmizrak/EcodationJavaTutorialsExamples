package com.ecodation.a012.jenerics;

public class J001_JenericsClass<T> {

	/*
	 * Jenericsi Tür güvenliği sağlıyor Casting yapmamıza gerek kalmıyor Dinamik bir
	 * değişken (data-type) yapıdır. var
	 */
	// Nesne değişkenlerimiz
	private T name;
	private T surname;
	private int password;

	// getter setter
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getSurname() {
		return surname;
	}

	public void setSurname(T surname) {
		this.surname = surname;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
