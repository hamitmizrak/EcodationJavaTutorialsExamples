package com.ecodation.a009.innerclass;

public class DisClass {
	// dıştaki Class
	private String ad;
	private String soyad;
	private int yas;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	// içteki clas
	class icice {
		private String ozelBilgiler;
		private String diger_ozelBilgiler;

		public String getOzelBilgiler() {
			return ozelBilgiler;
		}

		public void setOzelBilgiler(String ozelBilgiler) {
			this.ozelBilgiler = ozelBilgiler;
		}

		public String getDiger_ozelBilgiler() {
			return diger_ozelBilgiler;
		}

		public void setDiger_ozelBilgiler(String diger_ozelBilgiler) {
			this.diger_ozelBilgiler = diger_ozelBilgiler;
		}

	}

}
