package com.ecodation.a007.inheritance;

//pojo
public class Bilgisayar {
	// field=Nesne deðiþkenleri
	private int id;
	private String anakart = "";
	private double ram = 0;
	private String islemci = "";
	private String klavye = "";

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
