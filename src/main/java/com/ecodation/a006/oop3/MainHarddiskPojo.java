package com.ecodation.a006.oop3;

public class MainHarddiskPojo {

	public static void main(String[] args) {

		HarddiskPojo harddiskPojo = new HarddiskPojo();
		harddiskPojo.setId(455115);
		harddiskPojo.setMarka("WD");
		harddiskPojo.setRenk("Mavi");
		harddiskPojo.setFiyat(500);
		harddiskPojo.setYapimYili("2019");

		System.out.println("ID: " + harddiskPojo.getId() + " Fiyati: " + harddiskPojo.getFiyat());

	}

}
