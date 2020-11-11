package com.alok.org;

//import java.util.Comparator;
//public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
//        Function<? super T, ? extends U> keyExtractor)
public class GenericsTest<T, U> {

	T r1;
	U r2;
	public GenericsTest(T r1, U r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	private void print() {
		System.out.println(this.r1 + " " + this.r2);
	}
	
	public static void main(String[] args) {
		GenericsTest obj = new GenericsTest(new animal(), new bird());
		obj.print();
	}

}


class animal{
	
}

class bird extends animal{
	
}

class odd{
	
}