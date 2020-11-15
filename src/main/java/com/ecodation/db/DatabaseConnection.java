package com.ecodation.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	private static DatabaseConnection instance;
	private String url = "jdbc:mysql://localhost:3306/ecodation";
	private String user = "root";
	private String password = "root";
	private Connection connection;
	private ResultSet resultSet;
	// singleton Design pattern = new oluşturmamalısın.

	// parametresiz constructor
	private DatabaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver yüklendi");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Başarıyla DB bağlantısı yapıldı");
		} catch (SQLException sql) {
			System.out.println("Sql hatası");
			sql.printStackTrace();
		} catch (ClassNotFoundException classNot4) {
			System.out.println("Driver yüklü değil");
			classNot4.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Instance
	public static DatabaseConnection getInstance44() {
		try {
			if (instance == null) {
				instance = new DatabaseConnection();
			} else {
				return instance;
			}
		} catch (Exception e) {

		}
		return instance;
	}

	public static void main(String[] args) {
		DatabaseConnection db = new DatabaseConnection();
	}

}
