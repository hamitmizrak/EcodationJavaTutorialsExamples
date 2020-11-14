package com.ecodation.a006.oop3;

public class MainHarddiskBean {

	public static void main(String[] args) {

		// 1.Nesne
		HarddiskBean harddiskBean = new HarddiskBean();
		harddiskBean.setFiyat(300);
		harddiskBean.setMarka("Samsung");
		harddiskBean.setRenk("ye�il");
		harddiskBean.setYapimYili("2018");
		harddiskBean.setId(511515);

		System.out.println("ID: " + harddiskBean.getId() + " marka: " + harddiskBean.getMarka() + " yap�m y�l�: "
				+ harddiskBean.getYapimYili());

		// 2.nesne
		// arg�manlar kullanarak �a��rmak istiyorum
		HarddiskBean harddiskBean2 = new HarddiskBean(444, "Samsung", "turuncu", 1000, "2020");
		System.out.println("ID: " + harddiskBean2.getId() + " marka: " + harddiskBean2.getMarka() + " yap�m y�l�: "
				+ harddiskBean2.getYapimYili());

		// 3. nesne
		HarddiskBean harddiskBean3 = new HarddiskBean(5555, 1200, "1980");
		System.out.println("ID: " + harddiskBean3.getId() + " marka: " + harddiskBean3.getMarka() + " yap�m y�l�: "
				+ harddiskBean3.getYapimYili());

		System.out.println(harddiskBean);
		System.out.println(harddiskBean2);
		System.out.println(harddiskBean3);

		// instanceOf =de�i�kenin o nesneye ait olup p�mad���n� ��renmek i�in
		if (harddiskBean3 instanceof HarddiskBean) {
			System.err.println("bu de�i�ken evet bu nesneye'dir");
		} else {
			System.err.println("Hay�r bu nesneye ait de�ildir.");
		}

	}

}
