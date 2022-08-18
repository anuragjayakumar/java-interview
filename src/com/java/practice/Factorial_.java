package com.java.practice;

public class Factorial_ {
	public static void factorial1() {
		int fact = 1;
		int i = 1;
		while (i<=4) {
			fact=fact*i;
			i++;
			//1*2*3*4 =24
			
		}
		System.out.println(fact);
				
		

	}
	public static  void factorial2() {
		int fact = 1;
		int i = 1;
		while (i<=10) {
			fact=fact*i;
			i++;
			
		}
		System.out.println(fact);
				
		
		

	}
	public static void main(String[] args) {
		factorial1();
		factorial2();
		
		
	}

}
