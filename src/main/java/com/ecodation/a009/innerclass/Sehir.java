package com.ecodation.a009.innerclass;

import java.util.ArrayList;
import java.util.List;

public class Sehir {

	private long id;
	private String sehirAdi;
	private String plaka;
	private Ulke ulke;
	private List<Mahalle> mahalleList;

	public Sehir() {
		this.mahalleList = new ArrayList<Mahalle>();
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSehirAdi() {
		return sehirAdi;
	}

	public void setSehirAdi(String sehirAdi) {
		this.sehirAdi = sehirAdi;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public Ulke getUlke() {

		return ulke;
	}

	public void setUlke(Ulke ulke) {
		if (this.ulke == null) {
			ulke = new Ulke();
		}
		this.ulke = ulke;
	}

}
