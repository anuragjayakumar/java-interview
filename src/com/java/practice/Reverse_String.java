package com.java.practice;

public class Reverse_String {
	public static  void char_reverse() {
		String s = "ANURAG";
		for(int i = s.length()-1; i>=0;i--){
			 char reverse = s.charAt(i);
			 System.out.print(reverse);


		}
		

	}
	public static  void Reverse_Number() {
		int num = 7676878;
		int reverse = 0 ;
		while (num!= 0) {
			int rem = num % 10;
			reverse = reverse*10+rem;
			
			
		}
		System.out.println("the reverse of the given number:"+reverse);
		
		
				

	}
	public static void main(String []args){
		//char_reverse();
		Reverse_Number();
		
		

		}
	

}
