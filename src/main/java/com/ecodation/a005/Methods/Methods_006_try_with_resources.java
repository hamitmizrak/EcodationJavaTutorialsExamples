package com.ecodation.a005.Methods;

import java.sql.Connection;
import java.util.Scanner;

public class Methods_006_try_with_resources {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Connection conn;
		try (conn) {

			int x = klavye.nextInt();

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			// 4554

		} catch (Exception e) {

		}

		// int y = klavye.nextInt();

	}

}
