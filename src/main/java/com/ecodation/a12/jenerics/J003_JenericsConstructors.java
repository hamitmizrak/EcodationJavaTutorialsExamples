package com.ecodation.a12.jenerics;

public class J003_JenericsConstructors<T> {

	private T name;

	// parametresiz constrcutor
	public J003_JenericsConstructors() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constrcutor
	public J003_JenericsConstructors(T name) {
		super();
		this.name = name;
	}
    // getter and setter
	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	
	

}
