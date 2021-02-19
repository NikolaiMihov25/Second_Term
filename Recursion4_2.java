package edu;

public class Recursion4_2 {

	public static void main(String[] args) {
		

	}
	public static int sum(int n, int result){
		if(n==0)
			return result;
		else
			return sum(n-1, result + n);
	}
}
