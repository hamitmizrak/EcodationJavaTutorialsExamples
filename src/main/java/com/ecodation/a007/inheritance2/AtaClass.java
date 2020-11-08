package com.ecodation.a007.inheritance2;

import java.io.Serializable;

public class AtaClass implements Serializable {
	private static final long serialVersionUID = 1834675886828945183L;

	// Ortak özellikler
	private String klavye = "";
	private String ekran = "";
	private String anakart = "";
	private String ekranKarti = "";
	private String sesKarti = "";

	// parametresiz constructor
	public AtaClass() {

	}

//parametreli constructor
	public AtaClass(String klavye, String ekran, String anakart, String ekranKarti, String sesKarti) {
		super();
		this.klavye = klavye;
		this.ekran = ekran;
		this.anakart = anakart;
		this.ekranKarti = ekranKarti;
		this.sesKarti = sesKarti;
	}

	// toString
	@Override
	public String toString() {
		return "AtaClass [klavye=" + klavye + ", ekran=" + ekran + ", anakart=" + anakart + ", ekranKarti=" + ekranKarti
				+ ",sesKarti=" + sesKarti + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((anakart == null) ? 0 : anakart.hashCode());
	 * result = prime * result + ((ekran == null) ? 0 : ekran.hashCode()); result =
	 * prime * result + ((ekranKarti == null) ? 0 : ekranKarti.hashCode()); result =
	 * prime * result + ((klavye == null) ? 0 : klavye.hashCode()); result = prime *
	 * result + ((sesKarti == null) ? 0 : sesKarti.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; AtaClass other = (AtaClass) obj; if (anakart == null) { if
	 * (other.anakart != null) return false; } else if
	 * (!anakart.equals(other.anakart)) return false; if (ekran == null) { if
	 * (other.ekran != null) return false; } else if (!ekran.equals(other.ekran))
	 * return false; if (ekranKarti == null) { if (other.ekranKarti != null) return
	 * false; } else if (!ekranKarti.equals(other.ekranKarti)) return false; if
	 * (klavye == null) { if (other.klavye != null) return false; } else if
	 * (!klavye.equals(other.klavye)) return false; if (sesKarti == null) { if
	 * (other.sesKarti != null) return false; } else if
	 * (!sesKarti.equals(other.sesKarti)) return false; return true; }
	 */

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void ataMethod() {
		System.out.println("Ata metodum");
	}

	// Getter setter
	public String getKlavye() {
		return klavye;
	}

	public void setKlavye(String klavye) {
		this.klavye = klavye;
	}

	public String getEkran() {
		return ekran;
	}

	public void setEkran(String ekran) {
		this.ekran = ekran;
	}

	public String getAnakart() {
		return anakart;
	}

	public void setAnakart(String anakart) {
		this.anakart = anakart;
	}

	public String getEkranKarti() {
		return ekranKarti;
	}

	public void setEkranKarti(String ekranKarti) {
		this.ekranKarti = ekranKarti;
	}

	public String getSesKarti() {
		return sesKarti;
	}

	public void setSesKarti(String sesKarti) {
		this.sesKarti = sesKarti;
	}

}
