package com.ecodation.a006.oop;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 8529885125725029466L; // unique

	private long id;
	private String name;
	private String surname;
	private String number;
	private int cellPhone;

	// parametresiz constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Student(long id, String name, String surname, String number, int cellPhone) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.number = number;
		this.cellPhone = cellPhone;
	}

	// Getter and setter
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

	// Shift+Alt+S toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", number=" + number + ", cellPhone="
				+ cellPhone + "]";
	}

}
