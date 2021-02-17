package edu;

import java.util.Scanner;

public class Recursion1_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Sum is " + recursive(n));
		System.out.println("Sum is " + interative(n));
	}
		public static long recursive(int n) {
			long sum = 2;
			if (n==1)
				sum = 2;
			else 
				sum = sum*recursive(n-1);
			return sum;
		}
		
		public static long interative(int n) {
			return (long) Math.pow(2, n);
			
		}
}
