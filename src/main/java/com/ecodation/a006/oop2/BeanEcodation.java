package com.ecodation.a006.oop2;

import java.io.Serializable;

public class BeanEcodation implements Serializable {
	private static final long serialVersionUID = -4353963212916442305L;

	//

	// Bean örneği
	private String name = "";
	private String surname = "";
	private int age;

	// Overloading
	// Parametresiz Constructor
	public BeanEcodation() {
		this.name = "isim yazmadınız";
		this.surname = "Soyisim yazmadınız";
		this.age = 0;

	}

	// 2 Parametreli Constructor
	public BeanEcodation(String name, String surname) {
		// super();
		this.name = name;
		this.surname = surname;
	}

	// 3 parametreli constructor
	public BeanEcodation(String name, String surname, int age) {

		// this.name = name;
		// this.surname = surname;
		this(name, surname);
		this.age = Math.abs(age);

		/*
		 * if (age <= 0) { System.out.println("Kişi yaşı 0 veya negatif olamaz"); } else
		 * { this.age = age; }
		 */

	}
//Metotlar

	@Override
	public String toString() {
		return "BeanEcodation [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	// Getter and Setter
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Kişinin yaşı 0 veya sıfırdan küçük olamaz");
		} else {
			this.age = age;
		}

	}

}
