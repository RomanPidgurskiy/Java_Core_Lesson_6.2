package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public void plus(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
		
	}

	@Override
	public void minus(int a, int b) {
		System.out.println(a+" - "+b+" = "+(a-b));
		
	}

	@Override
	public void multi(int a, int b) {
		System.out.println(a+" x "+b+" = "+(a*b));
		
	}

	@Override
	public void dev(int a, int b) {
		if(b==0 || a==0) System.out.println("ERROR! Division by zero");
		 else
			System.out.println(a+" / "+b+" = "+(a/b));
		
	}

}
