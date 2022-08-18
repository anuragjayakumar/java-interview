package com.java.practice;

public class Replace_special_character {
	public static void main(String []args){
		String s = "Anu%@Rag1999"; //ReplaceAll
		String value = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(value);


		}

}
