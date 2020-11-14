package com.ecodation.a006.oop3;

import java.io.Serializable;

//bean= pojo +constructor +method
//Serileþtirme : implements Serializable
public class HarddiskBean implements Serializable {
	private static final long serialVersionUID = 5772256835083888151L;

	// private demek encapsulation

	// nesne deðiþkenleri
	private long id;
	private String marka;
	private String renk;
	private double fiyat;
	private String yapimYili;

	// parametresiz constructor =
	public HarddiskBean() {
		this.fiyat = 0;
		this.yapimYili = "2020";
		this.marka = "IBM"; // default deðerler verebileceðiniz
		this.renk = "mavi"; // default deðerler verebileceðiniz
	}

	// parametreli constructor
	public HarddiskBean(long id, String marka, String renk, double fiyat, String yapimYili) {
		this.id = id;
		this.marka = marka;
		this.renk = renk;
		this.fiyat = fiyat;
		this.yapimYili = yapimYili;
	}

	// overloading
	public HarddiskBean(long id, double fiyat, String yapimYili) {
		this.id = id;
		this.fiyat = fiyat;
		this.yapimYili = yapimYili;
	}

	// toString
	@Override
	public String toString() {
		return "HarddiskBean [id=" + id + ", marka=" + marka + ", renk=" + renk + ", fiyat=" + fiyat + ", yapimYili="
				+ yapimYili + "]";
	}

	// getter and setter=Shift+alt+S
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public String getYapimYili() {
		return yapimYili;
	}

	public void setYapimYili(String yapimYili) {
		this.yapimYili = yapimYili;
	}

}
