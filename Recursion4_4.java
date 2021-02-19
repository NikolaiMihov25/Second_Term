package edu;

public class Recursion4_4 {

	public static void main(String[] args) {
		double array[] = {7, -5, 65};
		System.out.println(average(array));

	}
	static double average(double a[]){
		return sumR(a, a.length - 1, 0)/a.length;
	}
	
	static double sumR(double a[], int i, double sum){
		if(i<0){
			return sum;
		}
		return sumR(a, i - 1, sum + a[i]);
	}
//	
//	static double averageR(int a[], int i, int n){
//		if(i == n -1){
//			return a[i];
//		}
//		if(i ==0){
//			return ((a[i] + averageR(a, i+1, n))/n);
//		}
//		
//		return (a[i] + averageR(a, i+1, n));
//	}
}
