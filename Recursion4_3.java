package edu;

public class Recursion4_3 {

	public static void main(String[] args) {
		

	}
	public static int powR(int x, int n, int result){
		if(n==0){
			return result;}
		return powR(x, n -1, result*x);
	}
}
