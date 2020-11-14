package com.ecodation.a006.oop4;

import java.io.Serializable;

//ortak özelliklerinin olduðu yerdir.
public class HarddiskKalitim implements Serializable {
	private static final long serialVersionUID = -7596864736448386558L;

	// genel ortak özellikler
	private long id;
	private String marka;
	private String renk;
	private double fiyat;
	private String yapimYili;
	private String hafiza;

	public HarddiskKalitim() {
		// TODO Auto-generated constructor stub
	}

	public HarddiskKalitim(long id, String marka, String renk, double fiyat, String yapimYili) {
		super();
		this.id = id;
		this.marka = marka;
		this.renk = renk;
		this.fiyat = fiyat;
		this.yapimYili = yapimYili;
	}

	public HarddiskKalitim(long id, String marka, String renk) {
		super();
		this.id = id;
		this.marka = marka;
		this.renk = renk;
	}

	public HarddiskKalitim(long id, double fiyat, String yapimYili) {
		super();
		this.id = id;
		this.fiyat = fiyat;
		this.yapimYili = yapimYili;

	}

	public HarddiskKalitim(long id, String marka, String renk, String yapimYili) {
		super();
		this.id = id;
		this.marka = marka;
		this.renk = renk;
		this.yapimYili = yapimYili;
	}

	public HarddiskKalitim(long id, String marka, String renk, double fiyat, String yapimYili, String hafiza) {
		super();
		this.id = id;
		this.marka = marka;
		this.renk = renk;
		this.fiyat = fiyat;
		this.yapimYili = yapimYili;
		this.hafiza = hafiza;
	}

	@Override
	public String toString() {
		return "HarddiskKalitim [id=" + id + ", marka=" + marka + ", renk=" + renk + ", fiyat=" + fiyat + ", yapimYili="
				+ yapimYili + ", hafiza=" + hafiza + "]";
	}

	// getter and seter
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

	public String getHafiza() {
		return hafiza;
	}

	public void setHafiza(String hafiza) {
		this.hafiza = hafiza;
	}

}
