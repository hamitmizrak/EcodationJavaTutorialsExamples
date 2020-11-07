package com.ecodation.a006.oop;

import java.io.Serializable;

//pojo  bean
//Pojo= private + getterAndSetter
//bean = pirvate+ getterAndSetter+Constructor
public class StudentBean implements Serializable {

	/// Encapsulation = private
	// Nesne deðiþkenidir.
	// access identifier
	private long id;
	private String name;
	private String surname;
	private String number;
	private int cellPhone;

	// Constructor
	// parametresiz constructor Ctrl +Space
	// Constructor : Biz eðer yazmazsak Java bizim için ara planda constructor
	// oluþturur.
	public StudentBean() {

		// New oluþturduðumuz zamanda
		// Sýnf ile ayný olmalý
		// return olmaz
	}

	// Ctrl+Alt+S ==> generate constructor field
	// parametreli constructor
	public StudentBean(long id, String name, String surname, String number, int cellPhone) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.cellPhone = cellPhone;
	}

	// Shift+Alt+S
	// getter: verileri getirmek yani okumak
	// setter: yazmak yani üzerine yazý yazmak
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}

}
