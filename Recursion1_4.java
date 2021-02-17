package edu;

import java.util.Scanner;

public class Recursion1_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		System.out.println("Sum is " + recursive(x, n));
		System.out.println("Sum is " + interative(x, n));
	}
		public static long recursive(int x, int n) {
			long sum = x;
			if (n==1)
				sum = x;
			else 
				sum = sum*recursive(x, n-1);
			return sum;
		}
		
		public static long interative(int x, int n) {
			return (long) Math.pow(x, n);
		}
}
