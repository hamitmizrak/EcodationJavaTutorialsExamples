package com.ecodation.a006.oop;

//pojo  bean
//Pojo= private + getterAndSetter
//bean = pirvate+ getterAndSetter+Constructor
public class StudentPojo {

	/// Encapsulation = private
	// Nesne deðiþkenidir.
	// access identifier
	private long id;
	private String name;
	private String surname;
	private String number;
	private int cellPhone;

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
