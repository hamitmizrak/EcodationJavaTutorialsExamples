package com.ecodation.a006.oop;

public class StudentMain2 {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(44);
		student.setName("Hamit");
		student.setSurname("Mýzrak");
		student.setCellPhone(4444);

		System.out.println("Id: " + student.getId());
		System.out.println("Telefon no: " + student.getCellPhone());
		System.out.println("Ad no: " + student.getName());
		System.out.println("Soyad no: " + student.getSurname());

	}
}
