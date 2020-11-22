package com.ecodation.ornekFileVize;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Vize {

//global değişken
	static Scanner klavye = new Scanner(System.in);
	public static final String VIZEPATH = "Vize_db.txt";

// Ana Dizin 
// Kullanıcı adı: root Kullanıcı şifre: root
	public static void main(String[] args) throws IOException {
		try {
			boolean sifre = LoginStudent();
			if (sifre) {
				Chooise();

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}
	}

	// chart metodu = applet Swing >>>> JEE
	private static int Chart(int x) {
		return x;

	}

	// Şifre
	// Kullanıcı adı: root Kullanıcı şifre: root
	private static boolean LoginStudent() {

		while (true) {
			String klavyeAdi, kullaniciAdi = "root", klavyeSifre, kullaniciSifre = "root";
			System.out.print("Kullanıcı Adı: ");
			klavyeAdi = klavye.nextLine();
			System.out.print("Kullanıcı Şifre: ");
			klavyeSifre = klavye.nextLine();
			// klavyeadi ==> databases
			if ((klavyeAdi.equals(kullaniciAdi)) && (klavyeSifre.equals(kullaniciSifre))) {
				return true;
			} else {
				System.out.println("");
				System.err.println("Kullanıcı adını veya şifreyi yanlış girdiniz");
				System.out.println("");
				return false;
			}
		}
	}

	// Karar mekanizması
	private static void Chooise() throws IOException {

		try {
			String choice, s = "sonsuzDongu", devam;
			while (s.equalsIgnoreCase("sonsuzDongu")) {
				System.out.println("1 ===> Kayıt Ekleme ");
				System.out.println("2 ===> Kayıt görüntüleme ");
				System.out.println("3 ===> Kayıt silme ");
				System.out.println("4 ===> Kayıt arama ");
				System.out.println("5 ===> Kayıt Güncelleme");
				System.out.println("6 ===>  Çıkış Yap");
				System.out.print("\n");
				System.out.println("Lütfen Seçim yapınız: ");
				choice = klavye.nextLine();

				try {
					if (choice.equals("1")) {
						AddStudent();
					} else if (choice.equals("2")) {
						ViewAllStudent();
					} else if (choice.equals("3")) {
						DeleteStudentByID();
					} else if (choice.equals("4")) {
						SearchStudentByID();
					} else if (choice.equals("5")) {
						updateRecordbyID();
					} else if (choice.equals("6")) {
						System.exit(0);
					}
				} catch (Exception e) {
				}

				System.out.println("Devam Etmek istiyor musunuz? E/H");
				devam = klavye.nextLine();
				if (devam.equals("h") || (devam.equals("H"))) {
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}

	}

	// öğrenci ekleme
	private static void AddStudent() throws IOException {

		try {
			System.out.println("Ekleme");
			BufferedWriter bw = new BufferedWriter(new FileWriter("Vize_db.txt", true));
			Scanner klavye = new Scanner(System.in);
			String ID, adi, soyadi, harfNotu;
			double vizeNotu, finalNotu, ortalama;
			System.out.print("Öğrenci Numarası: ");
			ID = klavye.nextLine();
			System.out.print("Öğrenci Adı:");
			adi = klavye.nextLine();
			System.out.print("Öğrenci soyadı: ");
			soyadi = klavye.nextLine();
			System.out.print("Öğrenci Vize Notu: ");
			vizeNotu = klavye.nextDouble();
			System.out.print("Final Notu: ");
			finalNotu = klavye.nextDouble();
			ortalama = Math.ceil(vizeNotu * 0.4 + finalNotu * 0.6);
			harfNotu = LetterNotes((int) ortalama);
			System.out.println("ID " + ID + " ad: " + adi + " soyad: " + soyadi + " vize: " + vizeNotu + " final: "
					+ finalNotu + " ortalama: " + ortalama + " harf not: " + harfNotu);
			bw.write(
					ID + "," + adi + "," + soyadi + "," + vizeNotu + "," + finalNotu + "," + ortalama + "," + harfNotu);
			bw.flush();
			bw.newLine();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}

	}

	// Harf Notes
	private static String LetterNotes(int notes) {

		if (75 < notes && notes <= 100) {
			return "A";
		} else if (50 < notes && notes <= 75) {
			return "B";
		} else if (25 < notes && notes <= 50) {
			return "C";
		}
		return "D";

	}

	// Bütün öğrencileri göster
	private static void ViewAllStudent() throws FileNotFoundException, IOException {

		try {
			BufferedReader br = new BufferedReader(new FileReader("Vize_db.txt"));
			String record;
			System.out.println(
					" ----------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"|   ID          Ad             Soyad          Vize            Final       ortalama       harf notu   |");
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------- ");
			while ((record = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(record, ",");
				System.out.println("|   " + st.nextToken() + "          " + st.nextToken() + "          "
						+ st.nextToken() + "         " + st.nextToken() + "            " + st.nextToken() + "        "
						+ st.nextToken() + "            " + st.nextToken() + "          |");
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}

	}

	// öğrenci sil
	private static void DeleteStudentByID() throws FileNotFoundException, IOException {

		try {
			System.out.println("Silme");
			Scanner klavye = new Scanner(System.in);
			String ID, record;
			File tempDB = new File("Vize_db_temp.txt");
			File db = new File("Vize_db.txt");
			BufferedReader br = new BufferedReader(new FileReader(db));
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
			System.out.print("silinecek öğrenci ID: ");
			ID = klavye.nextLine();
			while ((record = br.readLine()) != null) {
				if (record.contains(ID)) {
					continue;
				}
				bw.write(record);
				bw.flush();
				bw.newLine();
			}
			br.close();
			bw.close();
			db.delete();
			tempDB.renameTo(db);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}

	}

	// Öğrenci Arama
	private static void SearchStudentByID() throws FileNotFoundException, IOException {

		try {
			System.out.println("Arama");
			String ID, record;
			Scanner klavye = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new FileReader("Vize_db.txt"));
			System.out.print("Öğrenci  ID: ");
			ID = klavye.nextLine();
			System.out.println(
					" ----------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"|   ID          Ad             Soyad          Vize            Final       ortalama       harf notu   |");
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------- ");
			while ((record = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(record, ",");
				if (record.contains(ID)) {
					System.out.println("|   " + st.nextToken() + "          " + st.nextToken() + "          "
							+ st.nextToken() + "         " + st.nextToken() + "            " + st.nextToken()
							+ "        " + st.nextToken() + "            " + st.nextToken() + "          |");
				}
			}
			System.out.println(" ------------------------------------------------------------- ");
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}

	}

	// Öğrenci Güncelle
	private static void updateRecordbyID() throws FileNotFoundException, IOException {
		try {
			System.out.println("Güncelleme");
			String ID, adi, soyadi, record, record2, harfNotu;
			double vizeNotu, finalNotu, ortalama;
			File db = new File("Vize_db.txt");
			File tempDB = new File("Vize_db_temp.txt");
			BufferedReader br = new BufferedReader(new FileReader(db));
			BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
			Scanner klavye = new Scanner(System.in);
			System.out.print("Güncellenecek Öğrenci ID: ");
			ID = klavye.nextLine();
			System.out.println(
					" ----------------------------------------------------------------------------------------------------------------------");
			System.out.println(
					"|   ID          Ad             Soyad          Vize            Final       ortalama       harf notu   |");
			System.out.println(
					" --------------------------------------------------------------------------------------------------------------------- ");
			while ((record = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(record, ",");
				if (record.contains(ID)) {
					System.out.println("|   " + st.nextToken() + "          " + st.nextToken() + "          "
							+ st.nextToken() + "         " + st.nextToken() + "            " + st.nextToken()
							+ "        " + st.nextToken() + "            " + st.nextToken() + "          |");
				}

			}
			System.out.println(" ------------------------------------------------------------- ");
			br.close();

			System.out.print("Öğrenci Adı:");
			adi = klavye.nextLine();
			System.out.print("Öğrenci soyadı: ");
			soyadi = klavye.nextLine();
			System.out.print("Öğrenci Vize Notu: ");
			vizeNotu = klavye.nextDouble();
			System.out.print("Öğrenci Final Notu: ");
			finalNotu = klavye.nextDouble();
			ortalama = Math.ceil(vizeNotu * 0.4 + finalNotu * 0.6);
			harfNotu = LetterNotes((int) ortalama);
			BufferedReader br2 = new BufferedReader(new FileReader(db));
			while ((record2 = br2.readLine()) != null) {
				if (record2.contains(ID)) {
					bw.write(ID + "," + adi + "," + soyadi + "," + vizeNotu + "," + finalNotu + "," + ortalama + ","
							+ harfNotu);
				} else {
					bw.write(record2);
				}
				bw.flush();
				bw.newLine();
			}
			bw.close();
			br2.close();
			db.delete();
			boolean success = tempDB.renameTo(db);
			System.out.println(success);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hata: " + e);
		}

	}

}
