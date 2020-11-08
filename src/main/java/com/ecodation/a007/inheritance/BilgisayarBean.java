package com.ecodation.a007.inheritance;

import java.io.Serializable;

//bean=private deðiþkeni + getter/setter + constructor +serializable
public class BilgisayarBean implements Serializable {
	private static final long serialVersionUID = 5333982028480917395L;

	// field=Nesne deðiþkenleri
	private int id;
	private String anakart = "";
	private double ram = 0;
	private String islemci = "";
	private String klavye = "";

	// Boþ constructor
	public BilgisayarBean() {

	}

	// prametreli constructor
	public BilgisayarBean(int id, String anakart) {
		super();
		this.id = id;
		this.anakart = anakart;
	}

	public BilgisayarBean(int id, double ram, String klavye) {
		super();
		this.id = id;
		this.ram = ram;
		this.klavye = klavye;
	}

	public BilgisayarBean(int id, String anakart, double ram, String islemci, String klavye) {
		super();
		this.id = id;
		this.anakart = anakart;
		this.ram = ram;
		this.islemci = islemci;
		this.klavye = klavye;
	}

	// getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnakart(String anakart) {
		if (this.anakart == null) {
			this.anakart = "XKLM";
		}
		return anakart;
	}

	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public String getIslemci() {
		return islemci;
	}

	public void setIslemci(String islemci) {
		this.islemci = islemci;
	}

	public String getKlavye() {
		return klavye;
	}

	public void setKlavye(String klavye) {
		this.klavye = klavye;
	}

}
