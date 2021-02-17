package edu;

import java.util.Scanner;

public class Recursion2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n = ?");
		int n = in.nextInt();
		System.out.println(dec2Bin(n));
	}
	public static String dec2Bin(int n){
	if(n==1)
		return "1";
	else
		{return dec2Bin(n/2) + n%2;}
	}
}
