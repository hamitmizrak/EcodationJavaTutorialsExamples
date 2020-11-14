package com.ecodation.a009.innerclass;

import java.util.ArrayList;
import java.util.List;

public class Ulke {

	private long id;
	private String ulkeAdi;
	private String ulkeDili;
	private List<Sehir> sehirList;

	public Ulke() {
		this.sehirList = new ArrayList<Sehir>();
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUlkeAdi() {
		return ulkeAdi;
	}

	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}

	public String getUlkeDili() {
		return ulkeDili;
	}

	public void setUlkeDili(String ulkeDili) {
		this.ulkeDili = ulkeDili;
	}

	public List<Sehir> getSehirList() {
		if (this.sehirList == null) {
			sehirList = new ArrayList<Sehir>();
		}
		return sehirList;
	}

	public void setSehirList(List<Sehir> sehirList) {
		this.sehirList = sehirList;
	}

}
