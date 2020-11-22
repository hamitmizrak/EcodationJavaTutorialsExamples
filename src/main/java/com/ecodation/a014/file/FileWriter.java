package com.ecodation.a014.file;

import java.io.BufferedWriter;

public class FileWriter {

	public static void main(String[] args) {
		String path = "C:\\2020_Ecodation Java SE\\file\\deneme.txt";
		// File fileEcodation44= new File(path);
		BufferedWriter bW = null;
		FileWriter fW;

		try {

			fW = new FileWriter(path);
			bW = new BufferedWriter(fW);
			bW.write("Başak");

		} catch (Exception e) {
			System.err.println("Hata: " + e);
			e.printStackTrace();
		}

	}
}
