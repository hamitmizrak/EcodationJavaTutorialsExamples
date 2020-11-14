package com.ecodation.a008.abstractp;

public class MainClass {

	public static void main(String[] args) {

		// interheritance ile abstract arasıdaki fark
		// abstract= new oluşturamıyoruz
//		HarddiskKalitimAbstract harddiskKalitimAbstract = new HarddiskKalitimAbstract(44, "msi", "kırmızı", 5000, 2010,
//				"5GB");

		SamsungHarddisk samsungHarddisk = new SamsungHarddisk();
		samsungHarddisk.hardDiskMetodunuBunuYazmalisin();

		WdHarddisk wdHarddisk = new WdHarddisk();
		wdHarddisk.hardDiskMetodunuBunuYazmalisin();

		// polymorphism
		// sol taraf genel (dede) abstract sağ taraf class (torunu)
		HarddiskKalitimAbstract harddiskKalitimAbstract = new SamsungHarddisk();
	}

}
