package com.ecodation.a009.innerclass;

class OuterClass {
	int x = 25;

	class InnerClass {
		int y = 45;
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.y + outer.x);

	}
}
