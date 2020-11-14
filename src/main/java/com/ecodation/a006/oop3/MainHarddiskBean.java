package com.ecodation.a006.oop3;

public class MainHarddiskBean {

	public static void main(String[] args) {

		// 1.Nesne
		HarddiskBean harddiskBean = new HarddiskBean();
		harddiskBean.setFiyat(300);
		harddiskBean.setMarka("Samsung");
		harddiskBean.setRenk("yeşil");
		harddiskBean.setYapimYili("2018");
		harddiskBean.setId(511515);

		System.out.println("ID: " + harddiskBean.getId() + " marka: " + harddiskBean.getMarka() + " yapım yılı: "
				+ harddiskBean.getYapimYili());

		// 2.nesne
		// argümanlar kullanarak çağırmak istiyorum
		HarddiskBean harddiskBean2 = new HarddiskBean(444, "Samsung", "turuncu", 1000, "2020");
		System.out.println("ID: " + harddiskBean2.getId() + " marka: " + harddiskBean2.getMarka() + " yapım yılı: "
				+ harddiskBean2.getYapimYili());

		// 3. nesne
		HarddiskBean harddiskBean3 = new HarddiskBean(5555, 1200, "1980");
		System.out.println("ID: " + harddiskBean3.getId() + " marka: " + harddiskBean3.getMarka() + " yapım yılı: "
				+ harddiskBean3.getYapimYili());

		System.out.println(harddiskBean);
		System.out.println(harddiskBean2);
		System.out.println(harddiskBean3);

		// instanceOf =değişkenin o nesneye ait olup pşmadığını öğrenmek için
		if (harddiskBean3 instanceof HarddiskBean) {
			System.err.println("bu değişken evet bu nesneye'dir");
		} else {
			System.err.println("Hayır bu nesneye ait değildir.");
		}

	}

}
