package com.ecodation.db;

import java.sql.Connection;
import java.util.ArrayList;

// generics interface
public interface IDaoImplements<T> {

	// CRUD
	void create(T t);

	void update(T t);

	void delete(long id);

	ArrayList<T> list();

	// istisna durumu : 1.8 or üstü kullanabilirsin.
	default Connection getConnection() {

		// return DatabaseConnection.getInstance44().;

	}

}
