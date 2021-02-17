package edu;

public class Recursion1_1 {

	public static void main(String[] args) {
		 System.out.println("Sum is " + xRecursiveMethod(5));
		 System.out.println("Sum is " + xInterativeMethod(5));
	}

		public static int xRecursiveMethod(int n) {
			if (n==1)
				return 1;
			else 
				return n + xRecursiveMethod(n-1);
		}
		
		public static int xInterativeMethod(int n) {
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				sum+=i;
			}
			return sum;
		}
		

	

}
