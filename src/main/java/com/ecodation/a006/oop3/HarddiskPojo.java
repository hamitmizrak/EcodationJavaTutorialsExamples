package com.ecodation.a006.oop3;

//pojo
public class HarddiskPojo {

	// nesne deðiþkenleri
	private long id;
	private String marka;
	private String renk;
	private double fiyat;
	private String yapimYili;

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
