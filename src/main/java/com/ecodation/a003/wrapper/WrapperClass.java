package com.ecodation.a003.wrapper;

public class WrapperClass {

	public static void main(String[] args) {

		// data type = Primitive +Wrapper(Nesne)

		// primitive
		/*
		 * daha hýzlýdýr. Stack static programlama boyutu bellidir
		 */

		// wrapper
		/*
		 * heap daha yavaþtýr boyutu belli deðildir dinamik programlama
		 */

		// Tam sayýlar B> S > I > L
		byte b2 = 5;
		// b2=null; veremezsin

		Byte wrapperByte;
		wrapperByte = null;

		Byte wrapperByte2 = new Byte((byte) 4);
		wrapperByte2 = 5;
		wrapperByte2 = 15;
		System.out.println(wrapperByte2);

		Short shortWarpper = new Short((short) 44);

		Integer i8;
		Long l8;

		// Virgüllü sayýlar
		Float f8;
		Double d8 = null;
		System.out.println("sonuc:" + d8);

		// boolean

		Boolean b8;

		// karakter
		Character c8;

		Integer burak = null;
		Integer batu;

		batu = new Integer(34);

		Integer yagmur = new Integer(4);

		System.out.println(batu);

		/*  */

	}

}
