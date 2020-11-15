package com.ecodation.a011.enums;

public enum AylarEnumConstructor {
	ocak(1, "OCAK"), subat(2, "SUBAT"), mart(3, "MART"), nisan(4, "NISAN");

	private int key;
	private String value;

	private AylarEnumConstructor(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
