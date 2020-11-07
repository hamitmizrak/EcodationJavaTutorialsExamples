package com.ecodation.a002.primitive;

public class PrimitiveClass {
	public static void main(String[] args) {

		// f-L

		// tam sayýlar >> b > s > i > l default:0;
		byte b2 = 55;
		short s2 = 155;
		int i2 = 4554;
		long l2 = 454554L;

		// kayan noktalý (Virgüllü sayýlar) default:0.0
		float f2 = 44.44f;
		double d2 = 444.444;

		// boolean ==>default:false
//		boolean b3 = true;
//		boolean b4 = false;
		boolean b3 = true, b4, b5, b6, b7;
		b4 = false;
		b5 = 8 > 2;
		System.out.println(b5);
		if (b5) {
			System.out.println("büyüktür");
		} else {
			System.out.println("küçüktür");
		}

		// tek karakter ==> char
		char c5 = '@', unicodeCharacter;
		System.out.println(c5);

		// U+01E3
		unicodeCharacter = '\u0185';
		System.out.println(unicodeCharacter);

	}

}
