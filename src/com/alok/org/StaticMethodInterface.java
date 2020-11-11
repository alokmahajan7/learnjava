package com.alok.org;

public interface StaticMethodInterface {
	public static final int counter = 1;
	
	static int getCounter() {
		
		return counter;
	}
}


