package com.ecodation.a009.innerclass;

public class MainDisIcClass {

	public static void main(String[] args) {

		DisClass dis = new DisClass();
		dis.setAd("dis class adı");
		dis.setSoyad("dis soyad");
		dis.setYas(44);

		System.out.println(dis.getAd());

		/*
		 * DisClass.icice icteki=new DisClass.icice(); //static nested class için böyle
		 * yapıyoruz. Bütün alanda aynı bilgiler ve özel bilgiler olacak
		 * //NestedClass.icice icteki2=nested.new icice(); //static yazmazsak
		 * icteki.setOzelBilgiler("xxxxx"); icteki.setDiger_ozelBilgiler("yyyyy");
		 * nested.setIctekiClass(icteki); nested.tamBilgiler();
		 */

		DisClass.icice icClass = DisClass.new icice();
	}

}
