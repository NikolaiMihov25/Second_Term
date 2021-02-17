package edu;

public class Recursion4_3 {
	static int result = 1;
	
	public static void main(String[] args) {
		System.out.println(powRecursive(2, 4));
	}
	public static int powRecursive( int x, int n ) {
        if (n == 0) {
            return result;
        }
        result *= x;
        return powRecursive(x, n - 1 );
    }

}
