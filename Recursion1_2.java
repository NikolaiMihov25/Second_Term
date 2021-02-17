package edu;

public class Recursion1_2 {

	public static void main(String[] args) {
		 xMethod(1234567);
		    System.out.print("\n");
		 xInterativeMethod(1234567);
	}

	public static void xMethod(int n) {
	        if (n > 0) {
	            System.out.print(n % 10);
	            xMethod(n / 10);
	        
	        }
	 }
	
	public static void xInterativeMethod(int n) {
		while(n>0) {
			System.out.print(n%10);
			n/=10;}
	}


	}


