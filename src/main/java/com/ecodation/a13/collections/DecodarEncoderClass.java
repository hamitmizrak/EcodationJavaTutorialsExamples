package com.ecodation.a13.collections;

import java.util.Base64;

public class DecodarEncoderClass {
	public static void main(String[] args) {

		// Encoder = şifreli göstersin

		String kelime = "Java SE";
		System.out.println("orijinal hali:" + kelime);

		// Şifreleme
		java.util.Base64.Encoder encoder34 = Base64.getEncoder();
		String title_encoder = encoder34.encodeToString(kelime.getBytes());
		System.out.println("Şiflenmiş hali: " + title_encoder);

		// Şifre çözme
		Base64.Decoder decoder3 = java.util.Base64.getMimeDecoder();
		String title_decoder = new String(decoder3.decode(title_encoder));
		System.out.println("Şifre çözülmüş hali: " + title_decoder);

	}
}
