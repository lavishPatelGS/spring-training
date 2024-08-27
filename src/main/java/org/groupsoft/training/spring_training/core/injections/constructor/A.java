package org.groupsoft.training.spring_training.core.injections.constructor;

public class A {

	private int a;
	private int b;


	public A(int a, double b) {
		System.out.println("calling double constructor");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	
	public A(double a, int b) {
		System.out.println("calling int constructor");
		this.a = (int) a;
		this.b = b;
	}


//	public A(String a, String b) {
//		System.out.println("calling string constructor");
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//	}
	
	
//	public A(double a, double b) {
//		System.out.println("calling double constructor");
//		this.a = (int) a;
//		this.b = (int) b;
//	}
	

	@Override
	public String toString() {
		return "sum of a :" + a + "and  b :" + b + "is = " + (this.a + this.b);
	}
}
