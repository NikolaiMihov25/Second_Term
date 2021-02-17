package edu;

public class Recursion4_2 {
static int result = 1;
	public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
}

	public static int xMethod(int n) {
        if (n == 1)
            return result;
        else
        	result += n;
            return xMethod(n - 1);
}

}
