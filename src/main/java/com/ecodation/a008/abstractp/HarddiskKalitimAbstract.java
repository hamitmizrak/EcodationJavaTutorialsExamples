package com.ecodation.a008.abstractp;

import java.io.Serializable;

// 1 tane public
// static yazamam (inner haric)

//ortak �zelliklerinin oldu�u yerdir.
abstract public class HarddiskKalitimAbstract implements Serializable {
	private static final long serialVersionUID = -7596864736448386558L;

	// genel ortak �zellikler
	private long id;
	private String marka;
	private String renk;
	private double fiyat;
	private int yapimYili = 2010;
	private String hafiza;

	// parametresiz construc
	public HarddiskKalitimAbstract() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public HarddiskKalitimAbstract(long id, String marka, String renk, double fiyat, int yapimYili, String hafiza) {
		super();
		this.id = id;
		this.marka = marka;
		this.renk = renk;
		this.fiyat = fiyat;
		this.yapimYili = yapimYili;
		this.hafiza = hafiza;
	}

	// toString
	@Override
	public String toString() {
		return "HarddiskKalitim [id=" + id + ", marka=" + marka + ", renk=" + renk + ", fiyat=" + fiyat + ", yapimYili="
				+ yapimYili + ", hafiza=" + hafiza + "]";
	}

	// Methods
	public void tarihHesaplama() {

		int sonuc = 2020 - 2010;
		System.out.println(sonuc);
	}

	// abstract gövdesiz methods
	abstract public void hardDiskMetodunuBunuYazmalisin();

	// getter and setter
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

	public int getYapimYili() {
		return yapimYili;
	}

	public void setYapimYili(int yapimYili) {
		this.yapimYili = yapimYili;
	}

	public String getHafiza() {
		return hafiza;
	}

	public void setHafiza(String hafiza) {
		this.hafiza = hafiza;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
