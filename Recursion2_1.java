package edu;

import java.util.Scanner;

public class Recursion2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		odd(n);
		even(n);
	}
		public static void odd(int n) {
			if (n == 0)
				System.out.println("Not odd");
			else if (n == 1)
				System.out.println( "Odd");
			else odd(n-2);
		}
		
		public static void even(int n) {
			if (n == 1)
				System.out.println("Not even");
			else if (n == 0)
				System.out.println( "Even");
			else even(n-2);
		}
}
