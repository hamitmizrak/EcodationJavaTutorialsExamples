package com.ecodation.a007.inheritance2;

public class Msi extends AtaClass {
	private static final long serialVersionUID = -2496929035747017245L;

	String vr;

	public Msi() {
		super();
	}

	public Msi(String klavye, String ekran, String anakart, String ekranKarti, String sesKarti, String VR) {
		super(klavye, ekran, anakart, ekranKarti, sesKarti);
		this.vr = VR;
		// TODO Auto-generated constructor stub
	}

	public void altMethod() {

		super.ataMethod();
	}

}
