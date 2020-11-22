package com.ecodation.a014.file;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {

		try {
			// windows ==> \
			// linux ==> /

			// deneme.txt
			String path = "C:\\2020_Ecodation Java SE\\file";
			// String path = "C:\\2020_Ecodation Java SE\\file\\deneme.txt\\";
			File fileEcodation = new File(path);

			// is ==> boolean çağırmak (if else)
			// get ==> özellikleri çağırmak
			// set ==> özellikleri override ediyoruz.
			System.out.println("dizin var mı " + fileEcodation.exists());
			System.out.println("dizin çalıştırabiliriz mi " + fileEcodation.canExecute());
			System.out.println("dizin okunabilinir mi " + fileEcodation.canRead());
			System.out.println("dizin yazılabilinir mi " + fileEcodation.canWrite());

			System.out.println("dizin yolu: " + fileEcodation.getAbsolutePath());
			System.out.println("dizin adı: " + fileEcodation.getName());

			System.out.println("parent üst dizin yolu : " + fileEcodation.getParent());

			System.out.println("dizin misin ? " + fileEcodation.isDirectory());
			System.out.println("dosya mısın? " + fileEcodation.isFile());
			System.out.println("gizli misin ? " + fileEcodation.isHidden());
			/*
			 * if (!fileEcodation.isDirectory()) {
			 * System.out.println("Database yazılıyor..."); } else {
			 * System.out.println("Çıkış yapılıyor...."); System.exit(0); }
			 */

			System.out.println("boyut: " + fileEcodation.getTotalSpace());
			System.out.println("değiştirme:  " + fileEcodation.lastModified());
			// System.out.println("dosya mısın? " + File.separator);

			/*
			 * Locale lokal = new Locale("tr", "TR"); SimpleDateFormat sFormat = new
			 * SimpleDateFormat("dd MMMM yyyy HH:mm:ss", lokal); Date date = new
			 * Date(path.lastModified()); String str = sFormat.format(date);
			 * System.out.println("dosya değişiklik " + str); // son değiştirdiğim tarih
			 * milisaniye şimdiki tarih-1970
			 */

		} catch (Exception e) {
			System.err.println("Hata: " + e);
			e.printStackTrace();
		}

	}
}
