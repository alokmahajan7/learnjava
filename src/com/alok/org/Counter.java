package com.alok.org;

public class Counter implements StaticMethodInterface{
	
	public static void main(String[] args) {
		int counter = StaticMethodInterface.getCounter();
		System.out.println(PublicEnum.HomeAddress + " " + counter);
		PublicEnum s = PublicEnum.HomeAddress;
		if (s==PublicEnum.HomeAddress) {
			System.out.println("Success");
			System.out.println(PublicEnum.staticMethod());
			
		}
		
	}
}

interface enuminterface{
	public static final int limit = 10;
	public static int staticMethod() {return 0;};
}