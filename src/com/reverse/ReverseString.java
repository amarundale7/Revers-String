package com.reverse;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String a="programming is fun";
		String []s= a.split(" ");
		String output=" ";
		for(int i = s.length-1; i>=0; i--) {
			output = s[i] + " ";
			System.out.print(output);
		}
	}
	

}
